package com.proftelran.Homework;

public class CreditCard {
    private int number;
    private int pin;
    private double sum;
    private String currency;

    public CreditCard(int number, int pin, int sum, String currency) {
        this.number = number;
        this.pin = pin;
        this.sum = sum;
        this.currency = currency;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
