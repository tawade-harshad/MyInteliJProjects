package com.training.controller;

public interface BankOperations {

    public void deposit(int amount, int startBalance);

    public void withdraw(int amount, int minimumBalance, int startBalance);

    public void openFD(int amount, int  tenure, int minFDAmount, int minFDTenure);

}
