package com.training.application;

import com.training.example.BLZService;
import com.training.example.BLZServicePortType;
import com.training.example.DetailsType;

public class application {
    public static void main(String[] args) {
        BLZService bankService = new BLZService();
        BLZServicePortType bankServiceType = bankService.getBLZServiceSOAP12PortHttp();
        DetailsType value = bankServiceType.getBank("30150001");
        System.out.println("BIC Code : " + value.getBezeichnung() + " - Bank ORT : " + value.getOrt() + " - Bank Place : " + value.getPlz());
    }
}
