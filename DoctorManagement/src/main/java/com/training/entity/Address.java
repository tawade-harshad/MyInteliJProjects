package com.training.entity;

import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = {"flatNo","building","streetName","city","state","pincode"})
public class Address {
    private String flatNo;
    private String building;
    private String streetName;
    private String city;
    private String state;
    private long pincode;

    public Address() {
    }

    public Address(String flatNo, String building, String streetName, String city, String state, long pincode) {
        this.flatNo = flatNo;
        this.building = building;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }

    public String getFlatNo() {
        return flatNo;
    }

    public void setFlatNo(String flatNo) {
        this.flatNo = flatNo;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public long getPincode() {
        return pincode;
    }

    public void setPincode(long pincode) {
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "Address :" + "\n" +
                "Flat No :" + flatNo + '\'' +
                " Building :" + building + '\'' +
                " Street Name :" + streetName + '\'' + "\n" +
                " City :" + city + '\'' +
                " State :" + state + '\'' +
                " Pincode :" + pincode ;
    }
}
