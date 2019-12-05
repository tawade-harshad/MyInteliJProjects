package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
@Entity
@Table(name="JPCIBIL")
public class CibilScore {

    @Id
    private long customerId;
    private String customerName;
    private String panCardNumber;
    private int cibilScore;

}
