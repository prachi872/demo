package com.assgnment.demo.repository;

import com.assgnment.demo.entity.OrderHeader;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderHeaderRepository extends JpaRepository<OrderHeader, Long> {
    // You can add custom query methods if needed
}
