package com.training.assignment.D1112.beans;

import java.time.LocalDate;

public class BankAccounts {

    private long accountId;
    private String accountType;
    private String startDate, endDate;
    private long fdAmount;

    public BankAccounts() {
    }

    public BankAccounts(long accountId, String accountType, String startDate, String endDate, long fdAmount) {
        this.accountId = accountId;
        this.accountType = accountType;
        this.startDate = startDate;
        this.endDate = endDate;
        this.fdAmount = fdAmount;
    }

    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public long getFdAmount() {
        return fdAmount;
    }

    public void setFdAmount(long fdAmount) {
        this.fdAmount = fdAmount;
    }

    @Override
    public String toString() {
        return "BankAccounts{" +
                "accountId=" + accountId +
                ", accountType='" + accountType + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", fdAmount=" + fdAmount +
                '}';
    }
}
