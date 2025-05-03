package com.dev.everson.repository;

import com.dev.everson.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    // Custom query methods can be defined here if needed
    // For example, findByUsername(String username) to find users by username

    Optional<User> findByEmail(String email);


}
