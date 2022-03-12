package com.example.springstudy.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Hello {
    private String name;

    @Value("Test Data")
    private void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
