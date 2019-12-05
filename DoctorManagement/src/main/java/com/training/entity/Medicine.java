package com.training.entity;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(propOrder = {"codeNumber","medicineName","rateperUnit","type"})
public class Medicine {
    private long codeNumber;
    private String medicineName;
    private double rateperUnit;
    private String type;

    public Medicine() {
    }

    public Medicine(long codeNumber, String medicineName, double rateperUnit, String type) {
        this.codeNumber = codeNumber;
        this.medicineName = medicineName;
        this.rateperUnit = rateperUnit;
        this.type=type;

    }

    public long getCodeNumber() {
        return codeNumber;
    }

    public void setCodeNumber(long codeNumber) {
        this.codeNumber = codeNumber;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public double getRateperUnit() {
        return rateperUnit;
    }

    public void setRateperUnit(double rateperUnit) {
        this.rateperUnit = rateperUnit;
    }

    /*public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }*/


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Medicine{" +
                "codeNumber=" + codeNumber +
                ", medicineName='" + medicineName + '\'' +
                ", rateperUnit=" + rateperUnit +
                ", type='" + type + '\'' +
                '}';
    }
}
