package com.company;

public class Main {

    public static void main(String[] args) {

        DeutscheBank deutscheBank = new DeutscheBank("Deutsche Bank", 2000f);
        Commerzbank commerzbank = new Commerzbank("Commerzbank", 3000f);
        KfW kfw = new KfW("Kreditanstalt fuer Wiederaufbau", 3200f);
        UniCredit uniCredit = new UniCredit("Uni Credit", 3400f);

        Person fritzMaier = new Person("Fritz", "Maier", 1337.69f);
        Person josefHuber = new Person("Josef", "Huber", 2111.34f);
        Person michaelFessler = new Person("Michael", "Fessler", 23.56f);

        commerzbank.openBankAccount(fritzMaier);
        kfw.openBankAccount(michaelFessler);
        uniCredit.openBankAccount(josefHuber);
    }
}
