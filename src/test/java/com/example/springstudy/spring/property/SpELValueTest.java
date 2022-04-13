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
        System.out.println(spELValue.getPath());
        System.out.println(spELValue.getOsName());
        System.out.println(spELValue.getJavaVersion());
        System.out.println(spELValue.getOsVersion());
    }

    @Test
    void 연산_어노테이션() {
        System.out.println(spELValue.getGreeting());
        System.out.println(spELValue.isTrueOrFalse());
        System.out.println(spELValue.isUserAgeCheck());
    }
}