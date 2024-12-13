package com.assignment.demo.controller;

import com.assgnment.demo.entity.OrderHeader;
import com.assgnment.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping
    public ResponseEntity<OrderHeader> createOrder(@RequestBody OrderHeader order) {
        OrderHeader createdOrder = orderService.createOrder(order);
        return ResponseEntity.status(201).body(createdOrder);
    }

    @GetMapping("/{orderId}")
    public ResponseEntity<OrderHeader> getOrder(@PathVariable Long orderId) {
        OrderHeader order = orderService.getOrderById(orderId);
        return order != null ? ResponseEntity.ok(order) : ResponseEntity.notFound().build();
    }

    @PutMapping("/{orderId}")
    public ResponseEntity<OrderHeader> updateOrder(@PathVariable Long orderId, @RequestBody OrderHeader order) {
        OrderHeader updatedOrder = orderService.updateOrder(orderId, order);
        return updatedOrder != null ? ResponseEntity.ok(updatedOrder) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{orderId}")
    public ResponseEntity<Void> deleteOrder(@PathVariable Long orderId) {
        orderService.deleteOrder(orderId);
        return ResponseEntity.noContent().build();
    }
}
