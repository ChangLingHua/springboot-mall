package com.hua.springbootmall.service;

import com.hua.springbootmall.dto.CreateOrderRequest;
import com.hua.springbootmall.dto.OrderQueryParams;
import com.hua.springbootmall.model.Order;

import java.util.List;

public interface OrderService {

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
