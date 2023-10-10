package com.proftelran.Homework;

public class Santander extends ATM {

    public Santander(String name, int sum, String currency) {
        super(name, sum, currency);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setSum(double sum) {
        super.setSum(sum);
    }

    @Override
    public void setCurrency(String currency) {
        super.setCurrency(currency);
    }
}
