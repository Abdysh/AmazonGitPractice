package com.digital_nomads.javaFall2021.applications;

import static com.digital_nomads.javaFall2021.applications.KGBankInterface.*;

public class KGBankDemo {
    public static void main(String[] args) throws Exception {
        KyrgyzstanBank nursultanKyrgyzBankAccount = new KyrgyzstanBank("+996555444333");
        KyrgyzstanBank aidarKyrgyzBankAccount = new KyrgyzstanBank("+996555444355");
        nursultanKyrgyzBankAccount.deposit(100000);
        transferWithMbank(nursultanKyrgyzBankAccount , aidarKyrgyzBankAccount, 10000);
        System.out.println(nursultanKyrgyzBankAccount.getBalance());
        System.out.println(aidarKyrgyzBankAccount.getBalance());
        System.out.println(nursultanKyrgyzBankAccount.getPhoneNumber());
        System.out.println(aidarKyrgyzBankAccount.getPhoneNumber());


    }
}
