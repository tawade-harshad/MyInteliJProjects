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
@Table(name="JPLOAN")
public class Loan {
    @Id
    private int loanId;
    private LocalDate applicationDate;
    private String customerName;
    private double loanAmount;
    private String loanType;
    private String status;
}
