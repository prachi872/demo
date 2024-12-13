package com.assgnment.demo.entity;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Order_Item")
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderItemSeqId;

    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    private OrderHeader order;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    @Column(name = "quantity", nullable = false)
    private int quantity;

    @Column(name = "status", nullable = false)
    private String status;
}
