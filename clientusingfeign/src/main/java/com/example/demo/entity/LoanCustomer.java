package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class LoanCustomer {

    private long loanId;
    private String loanType;
    private LocalDate openDate;
    private LocalDate closeDate;
    private double loanAmount;
}