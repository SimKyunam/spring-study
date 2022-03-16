package com.example.springstudy.spring.scope;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@RequiredArgsConstructor
public class ServiceRequest {
    Customer customer;
    String productNo;
    String description;

    private final CustomerDao customerDao;

    public void setCustomerByCustomerNo(Long customerNo) {
        this.customer = customerDao.findCustomerByNo(customerNo);
    }
}
