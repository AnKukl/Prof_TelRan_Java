package com.proftelran.Homework;

public class Euronet extends ATM implements Converter {

    public Euronet(String name, int sum, String currency) {
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

    @Override
    public double converter(double eur) {
        if (getCurrency() == "EUR") {
            return eur * 1.05504;
        }
        return getSum();
    }
}

