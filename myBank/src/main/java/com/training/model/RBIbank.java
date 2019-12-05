package com.training.model;

import com.training.controller.BankOperations;

public class RBIbank implements BankOperations {

    private int currentBalance;
    private int minimumBalance;
    private int startBalance;
    private int fdInterest;
    private int savingInterest;
    private int minFDAmount;
    private int minFDTenure;


    public void deposit(int amount, int startBalance) {
        currentBalance = startBalance + amount;
        startBalance = currentBalance;
        System.out.println("You have deposited : " + amount + " and your current balance is : " + currentBalance );
    }

    public void withdraw(int amount, int minimumBalance, int startBalance) {
        currentBalance = startBalance;
        double tempBalance = currentBalance - amount;
        if(tempBalance <= minimumBalance){
            System.out.println("Your are not allowed to withdraw :" +amount + " as current balance " +currentBalance +" will breach minimum balance condition " +minimumBalance );
        }else {
            currentBalance = startBalance - amount;
            startBalance = currentBalance;
            System.out.println("Amount Withdrawn : " + amount + " Current Balance : " +currentBalance + " Start Balance : " +startBalance);
        }
    }

    public void openFD(int amount, int tenure, int minFDAmount, int minFDTenure) {
            if(amount < minFDAmount || tenure < minFDTenure){
                System.out.println("Minimum FD amount required is : " +minFDAmount + " and minimum FD tenure should be :" +minFDTenure);
            } else {
                System.out.println("FD Account opened successfully !!!");
            }
    }
}
