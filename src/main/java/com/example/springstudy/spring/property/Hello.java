package com.example.springstudy.spring.property;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Component;

import java.beans.PropertyEditor;
import java.util.List;

@Component
@Getter
public class Hello {
    private String name;

    @Value("${user.names}")
    private List<String> userList;

    @Value("Test Data")
    private void setName(String name) {
        this.name = name;
    }
}
