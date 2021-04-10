package com.zr.springboot.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @Value("${name}")
    private String name;
    @Value("${age}")
    private int age;

    @GetMapping("/say")
    public String say() {
        return "hello" + name + age;
    }
}
