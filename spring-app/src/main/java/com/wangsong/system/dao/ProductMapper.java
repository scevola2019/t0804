package com.wangsong.system.dao;

import com.wangsong.system.model.Product;
import com.wangsong.system.model.ProductPage;

import java.util.List;

public interface ProductMapper {

    int deleteByPrimaryKey(String id);

    int insert(Product record);

    Product selectByPrimaryKey(String id);

    List<Product> selectAll();

    int updateByPrimaryKey(Product record);

    List<Product> findTByPage(ProductPage productPage);

    int findTCountByT(ProductPage productPage);

    void deleteBy(String[] id);

    List<Product> findTByT(Product product);
}