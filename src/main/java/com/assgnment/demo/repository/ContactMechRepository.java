package com.assgnment.demo.repository;

import com.assgnment.demo.entity.ContactMech;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactMechRepository extends JpaRepository<ContactMech, Integer> {
    // Define custom queries if needed
}
