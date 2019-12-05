package com.training.beans;

import com.training.ifaces.Payment;

public class PaymentImpl implements Payment {
    @Override
    public double cardPayment(String cardProvider, double amount) {
        double amountDebited = amount;

        if(cardProvider.equalsIgnoreCase("amex")){
            amountDebited = amount + 10;
        }
        return amountDebited;
    }

    @Override
    public double cashPayment(double amount) {

        double gstAmount = amount * .05;
        double netAmount = amount + gstAmount;
        return netAmount;
    }
}
