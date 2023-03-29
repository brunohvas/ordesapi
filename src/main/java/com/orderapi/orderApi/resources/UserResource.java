package com.orderapi.orderApi.resources;

import com.orderapi.orderApi.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {


    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User (1L, "Maria", "maria@gmail", "4165864","8484848");
        return ResponseEntity.ok().body(u);
    }


}
