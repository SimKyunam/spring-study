package com.example.springstudy.spring.property;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@Getter
public class DataBaseConfig {
    @Value("${database.username}")
    private String dbName;

    @Value("${database.url}")
    private String dbUrl;

    @Value("${database.password}")
    private String dbPassword;

    @Value("${database.username}")
    public String dbNameBySpEL;
}
