package com.training.assignment.D1112.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Bank {

    @Autowired(required = false)
    private Map<Customer, List<BankAccounts>> bankMap ;

    public Bank() {
    }

    public Map<Customer, List<BankAccounts>> getBankMap() {
        return bankMap;
    }

    public void setBankMap(Map<Customer, List<BankAccounts>> bankMap) {
        this.bankMap = bankMap;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "bankMap=" + bankMap +
                '}';
    }
}
