package com.example.demo.demoController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@Service
public class UserServices {
    @Autowired
    UserRepositoryLayer userRepositoryLayer;


    public List<User> getUsers() {
        return userRepositoryLayer.findAll();
    }

    public void addUser(User user) {
        userRepositoryLayer.save(user);
    }
}