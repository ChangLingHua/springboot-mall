package com.hua.springbootmall.service;

import com.hua.springbootmall.constant.ProductCategory;
import com.hua.springbootmall.dto.ProductQueryParams;
import com.hua.springbootmall.dto.ProductRequest;
import com.hua.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);

}
