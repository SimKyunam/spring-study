package com.example.tobycontroller.controller;

import com.example.tobycontroller.handler.custom.CustomHandlerAdapter;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
class HelloCustomControllerTest {

    CustomHandlerAdapter customHandlerAdapter;

    @Autowired
    private MockMvc mockMvc;

    @Test
    void HelloCustomController_테스트() throws Exception {
        mockMvc.perform(get("/custom/hello")
                .param("name", "홍길동"))
                .andExpect(status().isOk())
                .andDo(print());
    }
}