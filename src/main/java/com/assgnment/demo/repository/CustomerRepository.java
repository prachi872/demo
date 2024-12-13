package com.assgnment.demo.repository;

import com.assgnment.demo.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

// This should be an interface, not a class
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    // You can define custom query methods here if needed
}
