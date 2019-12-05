package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ClientController {

    @Autowired
    private RestTemplate template;

    @Autowired
    private LoadBalancerClient balancer;

    @GetMapping(value = "/custList")
    public String sortedList(){
        ServiceInstance instance = balancer.choose("SHOW-CUSTOMER-DETAILS");

        String baseUrl = instance.getUri().toString();
//        String requestURL = baseUrl+"/customer/sort/loanType";
        String requestURL = baseUrl+"/port";
        String response = template.getForObject(requestURL, String.class);
        return response;
    }
}
