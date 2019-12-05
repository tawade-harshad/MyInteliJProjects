package com.example.demo.service;

import com.example.demo.entity.LoanCustomer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="SHOW-CUSTOMER-DETAILS")
public interface MyClient {

    @GetMapping(value = "/customer")
    public Iterable<LoanCustomer> findAllCustomers();
}
