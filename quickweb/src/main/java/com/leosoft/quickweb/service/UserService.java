package com.leosoft.quickweb.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.leosoft.quickweb.dao.UserDao;
import com.leosoft.quickweb.model.Greeting;

@Service("userService")
public class UserService {
    @Resource
    UserDao userDao;

    public Greeting greeting(String name) {
        return userDao.greeting(name);
    }

}
