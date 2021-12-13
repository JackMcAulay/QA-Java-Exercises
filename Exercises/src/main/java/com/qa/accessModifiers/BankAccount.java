package com.qa.accessModifiers;

public class BankAccount {
    private long accountNum;
    private float balance = 0;

    public float getBalance() {
        return this.balance;
    }

    public void setBalance(float newBalance) {
        this.balance = newBalance;
    }

    private BankAccount(long newAccountNum) {
        this.accountNum = newAccountNum;
    }

    public BankAccount(float newBalance, long newAccountNum) {
        this(newAccountNum);
        this.balance = newBalance;
    }

    public static BankAccount newBankAccount() {
        return new BankAccount(80105101114115L);
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNum=" + accountNum +
                ", balance=" + balance +
                '}';
    }
}
