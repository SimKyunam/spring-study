package com.example.springstudy.spring.scope;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ServiceRequestTest {
    @Autowired
    ApplicationContext context;

    @Test
    public void serviceRequest() {
        ServiceRequest serviceRequest = this.context.getBean(ServiceRequest.class);
        serviceRequest.setCustomerByCustomerNo(2L);

        Customer customer = serviceRequest.getCustomer();
        System.out.println(customer);
    }
}