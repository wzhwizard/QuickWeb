package com.leosoft.quickweb.config;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
public class DBconfig {
    @Bean
    @ConfigurationProperties(prefix = "jdbc")
    public DataSource datasource() {
        return new HikariDataSource();
    }
}
