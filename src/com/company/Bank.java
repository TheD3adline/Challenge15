package com.company;

public class Bank {

    private String bankName;
    private float creditLimit;

    public Bank(String bn, float cl) {
        this.bankName = bn;
        this.creditLimit = cl;
    }

    public void openBankAccount(Person person) {
        System.out.println("Hallo Herr " + person.getLastName());
        System.out.println("Sie haben Ihr Konto erfolgreich eroeffnet:");
        System.out.println();
        System.out.println("Name der Bank: " + bankName);
        System.out.println("Ihr Kontostand: " + person.getAccBalance());
        System.out.println("Kreditlimit: " + creditLimit);
        System.out.println("Wir freuen uns auf Ihren naechsten Besuch!");
        System.out.println("*******************************************************************");
        System.out.println();
    }
}
