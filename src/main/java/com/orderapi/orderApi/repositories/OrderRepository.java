package com.orderapi.orderApi.repositories;

import com.orderapi.orderApi.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
