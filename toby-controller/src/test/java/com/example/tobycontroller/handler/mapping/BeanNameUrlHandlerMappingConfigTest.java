package com.example.tobycontroller.handler.mapping;

import com.example.tobycontroller.controller.HelloController;
import com.example.tobycontroller.controller.HelloSimpleController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.handler.BeanNameUrlHandlerMapping;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@WebMvcTest
class BeanNameUrlHandlerMappingConfigTest {

    /**
     * 디폴트 핸들러 매핑 (책 기준)
     * BeanNameUrlHandlerMapping, DefaultAnnotationHandlerMapping
     * ControllerBeanNameHandlerMapping, ControllerClassNameHandlerMapping, SimpleUrlHandlerMapping
     */
    BeanNameUrlHandlerMapping beanNameUrlHandlerMapping;
    RequestMappingHandlerMapping requestMappingHandlerMapping;
    SimpleUrlHandlerMapping simpleUrlHandlerMapping;

    @Autowired
    private MockMvc mockMvc;

    @Test
    void BeanNameUrl_테스트() throws Exception {
        mockMvc.perform(get("/helloBean")
                .param("name", "홍길동"))
                .andExpect(status().isOk())
                .andExpect(view().name("/hello"))
                .andDo(print());
    }
}