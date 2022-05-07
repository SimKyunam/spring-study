package com.example.tobycontroller.servlet;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.handler.SimpleServletHandlerAdapter;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(HelloServlet.class)
class HelloServletTest {
    SimpleServletHandlerAdapter simpleServletHandlerAdapter;

    @Autowired
    private MockMvc mockMvc;

    @Test
    void HelloServlet_테스트() throws Exception {
        mockMvc.perform(get("/hello")
                .requestAttr("name", "홍길동"))
                .andExpect(status().isOk())
                .andDo(print());
    }
}