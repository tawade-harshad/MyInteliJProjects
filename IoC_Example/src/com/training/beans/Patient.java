package com.training.beans;

public class Patient {

    private long patientId;
    private String patientName;

    public Patient() {
    }

    public Patient(long patientId, String patientName) {
        this.patientId = patientId;
        this.patientName = patientName;
    }

    public long getPatientId() {
        return patientId;
    }

    public void setPatientId(long patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientId=" + patientId +
                ", patientName='" + patientName + '\'' +
                '}';
    }
}
