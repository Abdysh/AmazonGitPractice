package com.digital_nomads.javaFall2021.applications;

public class KyrgyzstanBank extends KGBankAbstract{

    private double balance = 0;

    public KyrgyzstanBank(String phoneNumber) {
        super(phoneNumber);
    }

//    public void transferWithPhoneNumber(String phoneNumber){
//
//    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void deposit(double amount) throws Exception {
        if (amount < 0 || amount > 100000){
            throw new Exception("Invalid amount");
        } else {
            balance += amount;
        }
    }

    @Override
    public void withDraw(double amount) throws Exception {
        if (amount < 0 || amount > 40000){
            throw new Exception("Invalid amount, can not be withdrawn");
        }
        else {
            if (balance < amount){
                throw new Exception("Insufficient funds");
            }
            else {
                balance -= amount;
            }
        }
    }
}
