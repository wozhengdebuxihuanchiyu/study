package com.yu.service;

import com.yu.config.DisableFeignOnClass;
import com.yu.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "simple-user",configuration = DisableFeignOnClass.class)
public interface UserService {
    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    User findOne(@PathVariable("id") Long id);
}
