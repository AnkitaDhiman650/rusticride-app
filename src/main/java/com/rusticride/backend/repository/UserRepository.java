package com.rusticride.backend.repository;

import com.rusticride.backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // You can add custom query methods here
}