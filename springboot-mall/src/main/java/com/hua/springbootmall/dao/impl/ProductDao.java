package com.hua.springbootmall.dao.impl;


import com.hua.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}