package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
@Entity
@Table(name="JPLoanCustomer")
public class LoanCustomer {

    @Id
    private long loanId;
    private String loanType;
    private LocalDate openDate;
    private LocalDate closeDate;
    private double loanAmount;
}
