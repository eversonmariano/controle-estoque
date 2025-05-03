package com.dev.everson.repository;

import com.dev.everson.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {
    // Custom query methods can be defined here if needed
    // For example, findByName(String name) to find suppliers by name

}
