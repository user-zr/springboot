package com.zr.springboot.cotroller;

import com.zr.springboot.user.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@RestController
public class MyController {

    @RequestMapping("/demo1")
    public ModelAndView demo1() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("mes", "Hello");
        mv.setViewName("show");
        return mv;
    }

    @RequestMapping("/demo2")
    public ModelAndView demo2(HttpServletRequest req) {
        ModelAndView mv = new ModelAndView();
        User u1 = new User("1", "1");
        User u2 = new User("2", "2");
        User u3 = new User("3", "3");

        List<User> list = new ArrayList();
        list.add(u1);
        list.add(u2);
        list.add(u3);
        mv.addObject("li",list);

        mv.setViewName("show");
        return mv;

    }
}
