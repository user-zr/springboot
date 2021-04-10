package com.zr.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class MyController {
    @RequestMapping("/one")
    public @ResponseBody Map first() {
        HashMap map = new HashMap();
        map.put("key", "value");
        return map;
    }
}
