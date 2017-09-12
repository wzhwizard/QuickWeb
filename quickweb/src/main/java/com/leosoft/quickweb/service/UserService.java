package com.leosoft.quickweb.service;

import javax.annotation.Resource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.leosoft.quickweb.dao.UserDao;
import com.leosoft.quickweb.model.Greeting;

@Service("userService")
public class UserService {
    Logger  logger = LogManager.getLogger();
    @Resource
    UserDao userDao;

    public Greeting greeting(String name) {
        logger.info("greeting {}", name);
        return userDao.greeting(name);
    }

}
