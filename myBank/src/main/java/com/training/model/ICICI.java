package com.training.model;


public class ICICI extends RBIbank {

    private int currentBalance;
    private int minimumBalance;
    private int startBalance;
    private int fdInterest;
    private int savingInterest;
    private int minFDAmount;
    private int minFDTenure;


    public int getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(int currentBalance) {
        this.currentBalance = currentBalance;
    }

    public int getMinimumBalance() {
        return minimumBalance;
    }

    public void setMinimumBalance(int minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

    public int getStartBalance() {
        return startBalance;
    }

    public void setStartBalance(int startBalance) {
        this.startBalance = startBalance;
    }

    public int getFdInterest() {
        return fdInterest;
    }

    public void setFdInterest(int fdInterest) {
        this.fdInterest = fdInterest;
    }

    public int getSavingInterest() {
        return savingInterest;
    }

    public void setSavingInterest(int savingInterest) {
        this.savingInterest = savingInterest;
    }

    public int getMinFDAmount() {
        return minFDAmount;
    }

    public void setMinFDAmount(int minFDAmount) {
        this.minFDAmount = minFDAmount;
    }

    public int getMinFDTenure() {
        return minFDTenure;
    }

    public void setMinFDTenure(int minFDTenure) {
        this.minFDTenure = minFDTenure;
    }

    @Override
    public void deposit(int amount, int startBalance) {
        super.deposit(amount, startBalance);
    }

    @Override
    public void withdraw(int amount, int minimumBalance, int startBalance) {
        super.withdraw(amount, minimumBalance, startBalance);
    }

    @Override
    public void openFD(int amount, int tenure, int minFDAmount, int minFDTenure) {
        super.openFD(amount, tenure, minFDAmount, minFDTenure);
    }
}
