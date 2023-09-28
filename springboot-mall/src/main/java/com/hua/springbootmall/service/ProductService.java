package com.hua.springbootmall.service;

import com.hua.springbootmall.dto.ProductRequest;
import com.hua.springbootmall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

}
