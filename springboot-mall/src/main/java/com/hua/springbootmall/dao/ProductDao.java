package com.hua.springbootmall.dao;


import com.hua.springbootmall.constant.ProductCategory;
import com.hua.springbootmall.dto.ProductRequest;
import com.hua.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {

    List<Product> getProducts(ProductCategory category, String search);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);

}
