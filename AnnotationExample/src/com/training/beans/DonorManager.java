package com.training.beans;

import com.training.annotations.QualifiedBank;
import com.training.ifaces.Bank;

import javax.enterprise.inject.Any;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

public class DonorManager {

    @Inject
    @QualifiedBank(type = BankType.BloodBank)
    private Bank bank;

    @Inject
    @Any
    private Instance<Bank> donorList;


    public String[] getBloodDonors(){
        return bank.topDonors();
    }

    public String[] getAllDonors(){

        List<String> masterList = new ArrayList();
        for (Bank eachInstance: donorList) {
            for (String eachDonor:eachInstance.topDonors()) {
                masterList.add(eachDonor);
            }
        }
        return masterList.toArray(new String[0]);
    }
}
