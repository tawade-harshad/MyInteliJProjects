package com.training.apps;

import com.training.beans.Doctor;
import com.training.beans.Patient;
import com.training.config.DoctorAppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class DoctorApplication {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(DoctorAppConfig.class);

        Doctor ramesh = ctx.getBean(Doctor.class);
        System.out.println("********************************************");
        System.out.println("DOCTOR DETAILS : " );
        System.out.println("********************************************");
        System.out.println("Id : " + ramesh.getDoctorId());
        System.out.println("Name : " + ramesh.getDoctorName());
        System.out.println("Address : ");
        System.out.println(ramesh.getAddress().getAddressLine1() + " , " + ramesh.getAddress().getAddressLine2());
        System.out.println(ramesh.getAddress().getCity() + " , " + ramesh.getAddress().getPincode());
        System.out.println("********************************************");
        System.out.println("PATIENT LIST : ");
        System.out.println("********************************************");
        List<Patient> patientList = ramesh.getPatient();
//        System.out.println(ramesh.getPatient());
        patientList.forEach(System.out::println);
        System.out.println("********************************************");
    }
}
