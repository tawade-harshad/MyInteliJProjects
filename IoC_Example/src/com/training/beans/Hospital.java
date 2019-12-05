package com.training.beans;

public class Hospital {

    private long hospitalCode;
    private String hospitalName;
    private long mobileNumber;

    public Hospital() {
        System.out.println("Hospital Initialized");
    }

    public Hospital(long hospitalCode, String hospitalName, long mobileNumber) {
        this.hospitalCode = hospitalCode;
        this.hospitalName = hospitalName;
        this.mobileNumber = mobileNumber;
    }

    public long getHospitalCode() {
        return hospitalCode;
    }

    public void setHospitalCode(long hospitalCode) {
        this.hospitalCode = hospitalCode;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "hospitalCode=" + hospitalCode +
                ", hospitalName='" + hospitalName + '\'' +
                ", mobileNumber=" + mobileNumber +
                '}';
    }
}
