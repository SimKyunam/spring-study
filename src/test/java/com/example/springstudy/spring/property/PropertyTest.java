package com.example.springstudy.spring.property;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PropertyTest {
    @Autowired
    private Hello hello;

    @Autowired
    private XmlHello xmlHello;

    @Test
    void Value_어노테이션() {
        System.out.println(hello.getName());
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
        System.out.println(xmlHello.getDbUrl());
    }

    @Test
    void Properties_우선순위_테스트() {
    }
}
