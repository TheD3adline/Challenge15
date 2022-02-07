package com.company;

public class Person {

    private String firstName;
    private String lastName;
    private float accBalance;

    public Person(String fn, String ln, float ab) {
        this.firstName = fn;
        this.lastName = ln;
        this.accBalance = ab;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public float getAccBalance() {
        return accBalance;
    }

    public void setAccBalance(float accBalance) {
        this.accBalance = accBalance;
    }
}
