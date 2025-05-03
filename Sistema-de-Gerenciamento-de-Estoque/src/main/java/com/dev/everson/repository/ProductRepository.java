package com.dev.everson.repository;

import com.dev.everson.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    // Custom query methods can be defined here if needed
    // For example, findByName(String name) to find products by name
}
