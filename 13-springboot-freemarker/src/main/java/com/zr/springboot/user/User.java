package com.zr.springboot.user;


import java.io.Serializable;

/*
@NoArgsConstructor  自动生成无参构造
@AllArgsConstructor 自动生成有参构造
@Data               自动生成getter和setter
* */

public class User  {

    private String name;
    private String age;

    public User() {
    }

    public User(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
