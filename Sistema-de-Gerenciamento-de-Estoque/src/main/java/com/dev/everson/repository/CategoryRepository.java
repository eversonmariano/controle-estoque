package com.dev.everson.repository;

import com.dev.everson.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    // Custom query methods can be defined here if needed
    // For example, findByName(String name) to find categories by name


}
