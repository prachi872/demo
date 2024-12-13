package com.assgnment.demo.service;

import com.assgnment.demo.entity.OrderHeader;

import java.util.List;

public interface OrderService {
    OrderHeader createOrder(OrderHeader order);
    OrderHeader getOrderById(Long orderId);
    List<OrderHeader> getAllOrders();
    OrderHeader updateOrder(Long orderId, OrderHeader order);
    void deleteOrder(Long orderId);
}
