package com.leosoft.quickweb.dao;

import javax.annotation.Resource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.leosoft.quickweb.model.Greeting;

@Component("userDao")
public class UserDao {
    @Resource
    JdbcTemplate jdbcTemplate;

    public Greeting greeting(String name) {
        jdbcTemplate.update("insert into greeting(name) values(?) on duplicate key update time=now()", name);
        return jdbcTemplate.queryForObject("select id,name,time from greeting where name =?",
                new Object[] { name }, new BeanPropertyRowMapper<Greeting>(Greeting.class));
    }

}
