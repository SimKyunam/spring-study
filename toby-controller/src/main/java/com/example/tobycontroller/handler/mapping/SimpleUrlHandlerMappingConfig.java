package com.example.tobycontroller.handler.mapping;

import com.example.tobycontroller.controller.HelloSimpleController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class SimpleUrlHandlerMappingConfig implements WebMvcConfigurer {
    @Bean
    public SimpleUrlHandlerMapping simpleUrlHandlerMapping() {
        SimpleUrlHandlerMapping simpleUrlHandlerMapping
                = new SimpleUrlHandlerMapping();

        Map<String, Object> urlMap = new HashMap<>();
        urlMap.put("/simpleUrl", helloSimpleBean());
        simpleUrlHandlerMapping.setUrlMap(urlMap);

        return simpleUrlHandlerMapping;
    }

    @Bean
    public HelloSimpleController helloSimpleBean() {
        return new HelloSimpleController();
    }
}
