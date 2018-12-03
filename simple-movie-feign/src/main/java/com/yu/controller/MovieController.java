package com.yu.controller;

import com.yu.entity.User;
import com.yu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

    @Autowired
    private UserService userService;

    @GetMapping("/movie/{id}")
    public User findOne(@PathVariable Long id){
        return  userService.findOne(id);
    }
}
