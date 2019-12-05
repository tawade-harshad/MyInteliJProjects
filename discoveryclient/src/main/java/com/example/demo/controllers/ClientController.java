package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ClientController {

    @Autowired
    private RestTemplate template;

    @Autowired
    private HttpEntity<String> entity;

    @GetMapping("/score/{pan}")
    public String getCibilScore(@PathVariable("pan") String pan){
        String url = "http://CHECK-LOAN-ELIGIBILITY/cibilScore/"+pan;
        String response = template.exchange(url,HttpMethod.GET,entity,String.class).getBody();
        return response;
    }

    @GetMapping("/type/{loanType}")
    public String findLoanByLoanType(@PathVariable("loanType") String loanType){
        String url = "http://CHECK-LOAN-AVAILABILITY/Loan/Type/"+loanType;
        String response = template.exchange(url,HttpMethod.GET,entity,String.class).getBody();
        return response;
    }

    @GetMapping("/status/{loanStatus}")
    public String findLoanByLoanStatus(@PathVariable("loanStatus") String loanStatus){
        String url = "http://CHECK-LOAN-AVAILABILITY/Loan/Status/"+loanStatus;
        String response = template.exchange(url,HttpMethod.GET,entity,String.class).getBody();
        return response;
    }

    @GetMapping("/ID/{loanId}")
    public String findLoanByLoanId(@PathVariable("loanId") int loanId){
        String url = "http://CHECK-LOAN-AVAILABILITY/Loan/"+loanId;
        String response = template.exchange(url,HttpMethod.GET,entity,String.class).getBody();
        return response;
    }
}
