package com.example.tobycontroller.handler.mapping;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@WebMvcTest
class SimpleUrlHandlerMappingConfigTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    void SimpleUrl_테스트() throws Exception {
        mockMvc.perform(get("/simpleUrl")
                .param("name", "홍길동"))
                .andExpect(status().isOk())
                .andExpect(view().name("/hello"))
                .andDo(print());
    }
}