package com.zr.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//springboot项目启动入口类
@SpringBootApplication  //spring核心注解，主要用于spring自动配置
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
