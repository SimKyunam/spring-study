package com.example.springstudy.spring.ymls;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Getter
public class BaseProperties {

    @Value("${database.name}")
    private List<String> username;

    @Value("${database.password}")
    private List<String> password;

    @Value("${user.names}")
    private List<String> userList;

    @Value("${user.age}")
    private Long userAge;
}
