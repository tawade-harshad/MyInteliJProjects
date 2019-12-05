package com.training.assignment.D1112.config;

import com.training.assignment.D1112.beans.Bank;
import com.training.assignment.D1112.beans.BankAccounts;
import com.training.assignment.D1112.beans.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Configuration
public class BankConfig {

    //First Customer
    @Bean
    public Customer harshad(){
        return new Customer(101,"Harshad T",9819865318L);
    }

//    @Bean
    @Autowired
    List<BankAccounts> listBank;

    @Bean
    public BankAccounts custBankAcct01(){
        return new BankAccounts(10140001L, "FD", "12 Nov 2109", "10 Nov 2020" ,100000);
    }

    @Bean
    public BankAccounts custBankAcct02(){
        return new BankAccounts(10140002L, "Saving", "12 Nov 2109", "10 Nov 2020" ,13000);
    }

    @Bean
    public BankAccounts custBankAcct03(){
        return new BankAccounts(10140003L, "Recurring", "12 Nov 2109", "10 Nov 2020" ,13000);
    }

    @Bean
    public Bank hdfc(){
        Map<Customer, List<BankAccounts>> bankMap = new HashMap<>();
        bankMap.put(harshad(), listBank);
        Bank bank = new Bank();
        bank.setBankMap(bankMap);
        return bank;
    }
}
