package com.orderapi.orderApi.services;

import com.orderapi.orderApi.entities.Order;
import com.orderapi.orderApi.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll(){
        return repository.findAll();
    }

    public Order findById(long id) {
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }
}
