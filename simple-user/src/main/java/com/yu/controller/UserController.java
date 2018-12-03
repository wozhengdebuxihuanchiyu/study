package com.yu.controller;

import com.yu.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.yu.entity.User;



/**
 * @Auther: yuchangying
 * @Date: 2018/11/26 11:28
 * @Description:
 * @Email yu.changying@trs.com.cn
 * @Version 1.0
 */
@RestController
public class UserController {

    @Autowired
    private UserDao userDao;

    @GetMapping("/user/{id}")
    public User findUserById(@PathVariable Long id){
        System.out.println("访问提供者11111");
        return userDao.findOne(id);
    }

}
