package com.training.ifaces;

public interface Payment {

    public double cardPayment(String cardProvider, double amount);
    public double cashPayment(double amount);

}
