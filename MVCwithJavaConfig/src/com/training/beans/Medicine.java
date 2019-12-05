package com.training.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//POJO for Medicine entity

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Medicine {
    private long code;
    private String medicineName;
    private double ratePerUnit;
    private String type;

}
