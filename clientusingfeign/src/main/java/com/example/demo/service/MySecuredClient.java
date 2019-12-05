package com.example.demo.service;

import com.example.demo.config.AppConfig;
import com.example.demo.entity.CibilScore;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="CHECK-LOAN-ELIGIBILITY", configuration = AppConfig.class)
public interface MySecuredClient {

    @GetMapping(value = "/cibilScore/{panNumber}")
    public CibilScore findCibilScore(@PathVariable("panNumber") String panCardNumber);
}
