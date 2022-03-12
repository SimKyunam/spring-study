package com.example.springstudy.learning.property;

import com.example.springstudy.spring.Hello;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class PropertyTest {
    private final List<String> dataList = new ArrayList<>();

    @Autowired
    private Hello hello;

    @BeforeEach
    public void init() {
    }

    @Test
    void Value_어노테이션() {
        System.out.println(hello.getName());
    }

}
