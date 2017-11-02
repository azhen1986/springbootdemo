package com.springboot.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.springboot.entity.User;

@EnableAutoConfiguration
@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/{id}")
    private User view(@PathVariable("id") Long id) {
        User user = new User();
        user.setId(id);
        user.setName("zhang");
        return user;
    }
    @RequestMapping("/")
    @ResponseBody
    private String index() {
        return "ok";
    }
    @RequestMapping("/test")
    private String hehe(@RequestParam("t1") String t1) {
        System.out.println(t1);
        return "ok";
    }

//    public static void main(String[] args) {
//        SpringApplication.run(UserController.class);
//    }
}
