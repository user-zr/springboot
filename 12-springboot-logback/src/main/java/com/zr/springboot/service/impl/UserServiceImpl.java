package com.zr.springboot.service.impl;

import com.zr.springboot.dao.UserDao;
import com.zr.springboot.service.UserService;
import com.zr.springboot.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao dao;

    @Override
    public List<User> findAll() {
        return dao.selectAll();
    }
}
