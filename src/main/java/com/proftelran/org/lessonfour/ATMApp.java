package com.proftelran.org.lessonfour;

public class ATMApp {

    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard();
        creditCard.setCurrencyType(Currency.EUR);

        CreditCard creditCardTwo = new CreditCard();
        creditCardTwo.setCurrencyType(Currency.EUR);

        chekCurrency(creditCard);
        chekCurrency(creditCardTwo);
    }

    public static void chekCurrency(CreditCard creditCard) {
        if (Currency.EUR == creditCard.getCurrencyType()) {
            System.out.println("It is correct type");
        }
    }
}

