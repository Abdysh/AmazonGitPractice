package com.digital_nomads.javaFall2021.applications;

public abstract class BankBase implements Bank {

    private long accountNumber;
    private long routingNumber;

    public BankBase(long accountNumber, long routingNumber) throws Exception{

        if (Long.toString(accountNumber).length() !=12){
            throw new Exception("Account number must be 12 digits");
        }
        else if (Long.toString(routingNumber).length() != 9){
            throw new Exception("Routing number must be 9");
        }
        else {
            this.accountNumber = accountNumber;
            this.routingNumber = routingNumber;

        }
    }

    protected BankBase() {
    }

    public long getAccountNumber(){
        return accountNumber;
    }
    public long getRoutingNumber(){
        return routingNumber;
    }
}
