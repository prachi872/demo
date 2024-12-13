package com.assgnment.demo.entity;

import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
@Table(name = "Product")

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;

    @Column(name = "product_name", nullable = false)
    private String productName;

    @Column(name = "color")
    private String color;

    @Column(name = "size")
    private String size;
}
