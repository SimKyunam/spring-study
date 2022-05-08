package com.example.tobycontroller.handler.mapping;

import com.example.tobycontroller.controller.HelloSimpleController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.handler.BeanNameUrlHandlerMapping;

@Configuration
public class BeanNameUrlHandlerMappingConfig implements WebMvcConfigurer {

    @Bean(name = "/helloBean")
    public HelloSimpleController helloBean() {
        return new HelloSimpleController();
    }
}
