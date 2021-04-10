package com.zr.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
    @RequestMapping("/hello")
    public @ResponseBody Object say(String message) {
        return "hello" + message;
    }
}
