package com.wangsong.system.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.wangsong.common.model.GetEasyUIData;
import com.wangsong.system.dao.ProductMapper;
import com.wangsong.system.model.Product;
import com.wangsong.system.model.ProductPage;
import com.wangsong.system.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductMapper productMapper;

    @Override
    public GetEasyUIData findTByPage(ProductPage productPage) {
        Page<Object> objects = PageHelper.startPage(productPage.getPage(), productPage.getRows());
        List<Product> tByPage = productMapper.findTByPage(productPage);
        return new GetEasyUIData(tByPage, objects.getTotal());
    }

    @Override
    @Transactional
    public void insertProduct(Product product) {
        productMapper.insert(product);
        ;
    }

    @Override
    @Transactional
    public void updateByPrimaryKeyProduct(Product product) {
        productMapper.updateByPrimaryKey(product);
    }

    @Override
    @Transactional
    public void deleteByPrimaryKeyProduct(String[] id) {
        productMapper.deleteBy(id);
    }

    @Override
    public Product selectByPrimaryKey(String id) {
        return productMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Product> findTByT(Product product) {
        return productMapper.findTByT(product);
    }


}
