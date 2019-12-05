package com.training.cdi;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@QualifiedBank(type = BankType.BookBank)
@ApplicationScoped
@Named
public class BookBank implements Bank {
    @Override
    public String[] topDonors() {
        return new String[]{"Ramesh","Swapnil","Sushil"};

    }
}
