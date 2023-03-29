package com.orderapi.orderApi.config;

import com.orderapi.orderApi.entities.User;
import com.orderapi.orderApi.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("Test")
public class TestConfig implements CommandLineRunner {



    @Override
    public void run(String... args) throws Exception {


    }
}
