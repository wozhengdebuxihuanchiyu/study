package com.yu.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.yu.service.MovieService;
import com.yu.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping("/movie/{id}")
    public User findOne(@PathVariable Long id){
        return movieService.findOne(id);
    }

}
