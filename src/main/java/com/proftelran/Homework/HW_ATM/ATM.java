package com.proftelran.Homework.HW_ATM;

import java.util.Scanner;

public abstract class ATM implements Converter {
    private String name;
    private double sum;

    private String currency;

    public String getCurrency() {
        return currency;
    }

    public ATM(String name, double sum, String currency) {
        this.name = name;
        this.sum = sum;
        this.currency = currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public void withdrawCash(double sum, CreditCard obj, ATM atm) {
        if (obj.getSum() >= sum) {
            obj.setSum(obj.getSum() - sum);
            atm.setSum(atm.getSum() - sum);
            System.out.println("Операция проведена успешо, с карты снято " + sum + "USD");
            System.out.println("Остаток средств на карте: " + obj.getSum() + "\nОстаток средств в банкомате: " + atm.getSum());
        } else {
            System.out.println("В банкомате недостаточно средств. Приносим свои извинения\n Операция завершена.\n Остаток средств на счёте: " + obj.getSum());

        }
    }

    public void depositCash(int sum, CreditCard obj) {
    }

    public void pinCheck(int pin, CreditCard obj) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пин-код:");
        int expecedPin = scanner.nextInt();
        if (expecedPin == pin) {
            System.out.println("Авторизация прошла успешно");
        } else {
            System.out.println("Неверный пин-код");
            pinCheck(pin, obj);
        }
    }

    @Override
    public double converter(double eur) {
        if (getCurrency() == "EUR") {
            return Converter.super.converter(eur);
        }
        return getSum();
    }
}
