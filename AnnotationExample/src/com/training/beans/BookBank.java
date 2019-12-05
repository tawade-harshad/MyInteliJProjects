package com.training.beans;

import com.training.annotations.QualifiedBank;
import com.training.ifaces.Bank;

@QualifiedBank(type = BankType.BookBank)
public class BookBank implements Bank {
    @Override
    public String[] topDonors() {
        return new String[]{"Ramesh","Swapnil","Sushil"};

    }
}
