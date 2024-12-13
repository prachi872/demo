package com.assgnment.demo.service.impl;

import com.assgnment.demo.entity.OrderHeader;
import com.assgnment.demo.repository.OrderHeaderRepository;
import com.assgnment.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderHeaderRepository orderHeaderRepository;

    @Override
    public OrderHeader createOrder(OrderHeader order) {
        return orderHeaderRepository.save(order);
    }

    @Override
    public OrderHeader getOrderById(Long orderId) {
        return orderHeaderRepository.findById(orderId).orElse(null);
    }

    @Override
    public List<OrderHeader> getAllOrders() {
        return orderHeaderRepository.findAll();
    }

    @Override
    public OrderHeader updateOrder(Long orderId, OrderHeader order) {
        if (orderHeaderRepository.existsById(orderId)) {
            order.setOrderId(orderId);
            return orderHeaderRepository.save(order);
        }
        return null;
    }

    @Override
    public void deleteOrder(Long orderId) {
        orderHeaderRepository.deleteById(orderId);
    }
}
