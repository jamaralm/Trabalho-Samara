package com.productManager.productManager.repository;

import com.productManager.productManager.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
