package com.leosoft.quickweb.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.leosoft.quickweb.model.Greeting;
import com.leosoft.quickweb.service.UserService;

@RestController
public class UserController {
    @Resource
    UserService userService;

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return userService.greeting(name);
    }
}
