package com.digital_nomads.javaFall2021.applications;

public class KGBankAbstract implements KGBankInterface{

    private String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public KGBankAbstract (String phoneNumber){

        if (phoneNumber.length() != 13 || !phoneNumber.startsWith("+")){
            System.err.println("Invalid phone number");
        } else {
            this.phoneNumber = phoneNumber;

        }

    }

    @Override
    public double getBalance() {
        return 0;
    }

    @Override
    public void deposit(double amount) throws Exception {

    }

    @Override
    public void withDraw(double amount) throws Exception {

    }
}
