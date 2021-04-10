package com.zr.springboot.web;

import com.zr.springboot.config.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableConfigurationProperties
public class IndexController {


    @Autowired
    private Person person;

    public void setPerson(Person person) {
        this.person = person;
    }

    @GetMapping("/say")
    public String say() {
        return person.getName() + person.getAge();
    }
}
