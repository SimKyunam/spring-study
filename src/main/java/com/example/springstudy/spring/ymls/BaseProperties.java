package com.example.springstudy.spring.ymls;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Getter
@Component
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
