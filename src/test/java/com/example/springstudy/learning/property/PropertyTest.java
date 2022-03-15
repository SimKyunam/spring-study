package com.example.springstudy.learning.property;

import com.example.springstudy.spring.DataBaseConfig;
import com.example.springstudy.spring.Hello;
import com.example.springstudy.spring.XmlHello;
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

    @Autowired
    private XmlHello xmlHello;

    @Autowired
    private DataBaseConfig dataBaseConfig;

    @BeforeEach
    public void init() {
    }

    @Test
    void Value_어노테이션() {
        System.out.println(hello.getName());
        System.out.println(hello.getDbName());
    }

    @Test
    void Xml_Value_테스트() {
        System.out.println(xmlHello.getNames());
        System.out.println(xmlHello.getAges());
        System.out.println(xmlHello.getDbName());
    }

    @Test
    void Properties_테스트() {
        System.out.println(hello.getDbUrl());
        System.out.println(xmlHello.getDbUrl());
    }

    @Test
    void Properties_우선순위_테스트() {
        System.out.println(dataBaseConfig.getDbUrl());
        System.out.println(dataBaseConfig.getDbName());
        System.out.println(dataBaseConfig.getDbPassword());
    }
}
