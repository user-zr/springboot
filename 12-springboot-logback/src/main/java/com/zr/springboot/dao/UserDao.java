package com.zr.springboot.dao;

import com.zr.springboot.user.User;

import java.util.List;

public interface UserDao {

    //查找所有的用户
//    @Select("select id,username,password,status from user")
    List<User> selectAll();
}
