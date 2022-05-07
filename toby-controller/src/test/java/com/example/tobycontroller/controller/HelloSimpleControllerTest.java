package com.example.tobycontroller.controller;

import com.example.tobycontroller.servlet.HelloServlet;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.mvc.SimpleControllerHandlerAdapter;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(HelloSimpleController.class)
class HelloSimpleControllerTest {
    SimpleControllerHandlerAdapter simpleControllerHandlerAdapter;

    @Autowired
    private MockMvc mockMvc;

    @Test
    void HelloSimple_테스트() throws Exception {
        Map<String, String> params = new HashMap<>();
        params.put("name", "Spring");
        Map<String, Object> model = new HashMap<>();

        new HelloSimpleController().control(params,model);

        assertEquals(model.get("message"), "Hello Spring");
    }

    @Test
    void HelloSimple_테스트2() throws Exception {
        mockMvc.perform(get("/simple/hello")
                .param("name", "홍길동"))
                .andExpect(status().isOk())
                .andDo(print());
    }
}