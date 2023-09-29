package com.hua.springbootmall.dao.impl;


import com.hua.springbootmall.dto.ProductRequest;
import com.hua.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);

}
