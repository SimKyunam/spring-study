package com.example.springstudy.spring;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Component;

import java.beans.PropertyEditor;

@Component
@Getter
public class Hello {
    private String name;

    @Value("${database.username}")
    private String dbName;

    @Value("${database.url}")
    private String dbUrl;

    @Value("Test Data")
    private void setName(String name) {
        this.name = name;
    }
}
