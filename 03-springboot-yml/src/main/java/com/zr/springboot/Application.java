package com.zr.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//springboot启动的入口类
@SpringBootApplication  //springboot的核心注解
public class Application {

    //springboot的代码必须放在同级或者下级目录下
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
