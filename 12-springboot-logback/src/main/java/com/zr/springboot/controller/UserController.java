package com.zr.springboot.controller;

import com.zr.springboot.service.UserService;
import com.zr.springboot.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @RequestMapping("/all")
    public List<User> findAllUser(){
        return service.findAll();
    }
}
