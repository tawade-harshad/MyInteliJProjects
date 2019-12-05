package com.training.beans;

import com.training.annotations.QualifiedBank;
import com.training.ifaces.Bank;

@QualifiedBank(type = BankType.BloodBank)
public class BloodBank implements Bank {
    @Override
    public String[] topDonors() {
        return new String[]{"Kishore","Amit","Ashish"};
    }
}
