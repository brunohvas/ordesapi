package com.orderapi.orderApi.repositories;

import com.orderapi.orderApi.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
