package com.orderapi.orderApi.repositories;

import com.orderapi.orderApi.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
