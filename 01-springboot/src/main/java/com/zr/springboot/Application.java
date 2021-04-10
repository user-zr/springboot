package com.zr.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//SpringBoot项目启动入口类
@SpringBootApplication()  //springboot核心注解，主要用于spring自动配置
public class Application {

    //springboot项目代码必须放到同级目录或者下级目录
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
