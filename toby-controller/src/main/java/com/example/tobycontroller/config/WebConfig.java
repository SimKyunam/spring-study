package com.example.tobycontroller.config;

import com.example.tobycontroller.controller.HelloCustomController;
import com.example.tobycontroller.controller.HelloSimpleController;
import com.example.tobycontroller.handler.custom.CustomHandlerAdapter;
import com.example.tobycontroller.handler.interceptor.LoggerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.handler.SimpleServletHandlerAdapter;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {
    @Bean
    public SimpleServletHandlerAdapter simpleServletHandlerAdapter() {
        return new SimpleServletHandlerAdapter();
    }

    @Bean(name = "/simple/hello")
    public HelloSimpleController helloSimpleController() {
        return new HelloSimpleController();
    }

    @Bean
    public CustomHandlerAdapter simpleHandlerAdapter() {
        return new CustomHandlerAdapter();
    }

    @Bean(name = "/custom/hello")
    public HelloCustomController helloCustomController() {
        return new HelloCustomController();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoggerInterceptor())
                .excludePathPatterns("/simple/hello");
    }
}
