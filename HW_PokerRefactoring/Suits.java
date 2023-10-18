package com.proftelran.Homework.HW_PokerRefactoring;

public enum Suits {
    CLUBS ("♠"),
    DIAMONDS ("♦"),
    HEARTS("♥"),
    SPADES("♣");

    private String suit;

    Suits(String suit) {
        this.suit = suit;
    }

    public String getSuit() {
        return suit;
    }
}
