package com.example.demo.controllers;

import com.example.demo.entity.Loan;
import com.example.demo.services.LoanServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(value="*")
public class LoanController {

    @Autowired
    private LoanServices services;

    @GetMapping(value="/Loan/Type/{loanType}")
    public List<Loan> findLoanByLoanType(@PathVariable("loanType") String loanType){
        return this.services.findLoanByLoanType(loanType);
    }

    @GetMapping(value="/Loan/Status/{loanStatus}")
    public List<Loan> findLoanByLoanStatus(@PathVariable("loanStatus") String loanStatus){
        return this.services.findLoanByStatus(loanStatus);
    }

    @GetMapping(value="/Loan/{loanId}")
    public Loan findLoanByLoanId(@PathVariable("loanId") int loanId){
        return this.services.findLoanById(loanId);
    }
}
