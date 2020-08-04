package com.wangsong.system.service;

import com.wangsong.common.model.GetEasyUIData;
import com.wangsong.system.model.Product;
import com.wangsong.system.model.ProductPage;

import java.util.List;

public interface ProductService {

    GetEasyUIData findTByPage(ProductPage productPage);

    void insertProduct(Product product);

    void updateByPrimaryKeyProduct(Product product);

    void deleteByPrimaryKeyProduct(String[] id);

    Product selectByPrimaryKey(String id);

    List<Product> findTByT(Product product);
}
