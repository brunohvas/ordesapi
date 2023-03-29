package com.orderapi.orderApi.repositories;

import com.orderapi.orderApi.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
