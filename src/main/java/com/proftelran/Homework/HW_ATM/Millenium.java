package com.proftelran.Homework.HW_ATM;

public class Millenium extends ATM {

    public Millenium(String name, double sum, String currency) {
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
