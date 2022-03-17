package com.example.springstudy.spring.property;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.UnsatisfiedDependencyException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.expression.spel.SpelEvaluationException;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SpELValueTest {
    @Autowired
    private SpELValue spELValue;

    @Test
    void Value_어노테이션() {
        System.out.println(spELValue.getDbName());
        System.out.println(spELValue.getPath());
        System.out.println(spELValue.getOsName());
        System.out.println(spELValue.getOsVersion());
    }
}