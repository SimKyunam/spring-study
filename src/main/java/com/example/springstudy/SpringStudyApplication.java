package com.example.springstudy;

import com.example.springstudy.spring.ymls.AppProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class)
@ImportResource({"classpath:beans.xml"})
public class SpringStudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringStudyApplication.class, args);
    }

}
