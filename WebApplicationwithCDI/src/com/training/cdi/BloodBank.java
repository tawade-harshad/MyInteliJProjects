package com.training.cdi;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@QualifiedBank(type = BankType.BloodBank)
@ApplicationScoped
@Named
public class BloodBank implements Bank {
    @Override
    public String[] topDonors() {
        return new String[]{"Kishore","Amit","Ashish"};
    }
}
