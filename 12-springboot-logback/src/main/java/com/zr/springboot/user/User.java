package com.zr.springboot.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/*
@NoArgsConstructor  自动生成无参构造
@AllArgsConstructor 自动生成有参构造
@Data               自动生成getter和setter
* */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User implements Serializable {

    private Integer id;
    private String username;
    private String password;
    private Integer status;
}
