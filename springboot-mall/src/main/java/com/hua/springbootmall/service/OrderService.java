package com.hua.springbootmall.service;

import com.hua.springbootmall.dto.CreateOrderRequest;
import com.hua.springbootmall.model.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
