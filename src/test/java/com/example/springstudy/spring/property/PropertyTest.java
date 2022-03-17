package com.example.springstudy.spring.property;

import com.example.springstudy.spring.property.DataBaseConfig;
import com.example.springstudy.spring.property.Hello;
import com.example.springstudy.spring.property.XmlHello;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class PropertyTest {
    @Autowired
    private Hello hello;

    @Autowired
    private XmlHello xmlHello;

    @Autowired
    private DataBaseConfig dataBaseConfig;

    @Test
    void Value_어노테이션() {
        System.out.println(hello.getName());
        System.out.println(hello.getDbName());
        System.out.println(hello.getUserList());
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
