package com.example.demo.demoController;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@Service
public class UserServices {
    public List<User> Users = Arrays.asList(
            new User(1, "The Java Spring Boot Course"),
            new User(2, "The complete Javascript Course"),
            new User(3, "Python for data science")
    );

    public List<User> getUsers(){
        return Users;
    }
}
