package com.yu.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.yu.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MovieService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "findOneFallback")
    public User findOne(Long id){
        return restTemplate.getForObject("http://Frist-Spring-Cloud-Provider-1/user/" + id, User.class);
    }

    public User findOneFallback(Long id){
        User user = new User();
        user.setId(id);
        return user;
    }
}
