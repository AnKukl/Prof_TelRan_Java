package com.proftelran.Homework;

import java.util.Scanner;

public class ATMApp {
    public static void main(String[] args) {
        Euronet euroCash = new Euronet("euroCash", 40000, "EUR");
        Millenium milleniumCash = new Millenium("milleniumCash", 20000, "USD");
        Santander santanderCash = new Santander("santanderCash", 23000, "USD");

        ATM[] atms = {euroCash, milleniumCash, santanderCash};

        CreditCard megaCash = new CreditCard(1293048202, 1293, 500, "EUR");

        for (ATM atm : atms) {
            if (atm.getCurrency() == "EUR") {
                atm.pinCheck(1293, megaCash);
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите сумму для снятия с карты:");
                int withdrawalAmount = scanner.nextInt();
                System.out.println("Учитывая конвертацию, с карты будет снято: " + atm.converter(withdrawalAmount));
                atm.withdrawCash(atm.converter(withdrawalAmount), megaCash, atm);
            }
        }
    }
}
