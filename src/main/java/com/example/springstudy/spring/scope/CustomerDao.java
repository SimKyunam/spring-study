package com.example.springstudy.spring.scope;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CustomerDao {

    private final List<Customer> list = new ArrayList<>();

    @PostConstruct
    public void init() {
        list.add(Customer.builder().customerNo(1L).name("심규남").age("20").build());
        list.add(Customer.builder().customerNo(2L).name("홍길동").age("30").build());
        list.add(Customer.builder().customerNo(3L).name("홍길동").age("30").build());
        list.add(Customer.builder().customerNo(4L).name("홍길동").age("30").build());
        list.add(Customer.builder().customerNo(5L).name("홍길동").age("30").build());
        list.add(Customer.builder().customerNo(6L).name("홍길동").age("30").build());
    }

    public Customer findCustomerByNo(Long customerNo) {
        return list.stream()
                .filter(customer -> customer.getCustomerNo().equals(customerNo))
                .findAny()
                .orElseThrow(RuntimeException::new);
    }
}

