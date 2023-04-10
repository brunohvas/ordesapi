package com.orderapi.orderApi.repositories;

import com.orderapi.orderApi.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
