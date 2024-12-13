package com.assgnment.demo.repository;

import com.assgnment.demo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    // Define custom queries if needed
}
