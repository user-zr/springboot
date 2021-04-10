package com.zr.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexApplication {
    @RequestMapping(value = "/hello")
    public @ResponseBody String say() {
        return "Hello SpringBoot";  //返回一个json
    }
}
