package com.example.tobycontroller.controller;

import com.example.tobycontroller.servlet.HelloServlet;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.function.support.HandlerFunctionAdapter;
import org.springframework.web.servlet.handler.SimpleServletHandlerAdapter;
import org.springframework.web.servlet.mvc.HttpRequestHandlerAdapter;
import org.springframework.web.servlet.mvc.SimpleControllerHandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(HelloController.class)
class HelloControllerTest {
    /**
     * AnnotationMethodHandlerAdapter annotationMethodHandlerAdapter;
     * as of Spring 3.2, in favor of RequestMappingHandlerAdapter
     */
    RequestMappingHandlerAdapter requestMappingHandlerAdapter;
    HttpRequestHandlerAdapter httpRequestHandlerAdapter;
    HandlerFunctionAdapter handlerFunctionAdapter;

    @Autowired
    private MockMvc mockMvc;

    @Test
    void HelloController_테스트() throws Exception {
        mockMvc.perform(get("/con/hello")
                .requestAttr("name", "홍길동"))
                .andExpect(status().isOk())
                .andDo(print());
    }
}