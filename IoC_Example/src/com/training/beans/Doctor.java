package com.training.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Doctor {

    private long doctorId;
    private String doctorName;
    private String specialization;

    private Address address;


    //Collaborating Object
    @Autowired
//    private Patient patient;
      private List<Patient> patient;

}
