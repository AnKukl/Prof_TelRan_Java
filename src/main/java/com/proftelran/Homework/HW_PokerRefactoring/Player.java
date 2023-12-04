package com.proftelran.Homework.HW_PokerRefactoring;

import java.util.ArrayList;
import java.util.List;

public class Player {
   private List<Card> hand;
   private String name;

    public List<Card> getHand() {
        return hand;
    }

    public void setHand(List hand) {
        this.hand = hand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Player(String name) {
        this.hand = new ArrayList<>();
        this.name = name;
    }
    public void addCardToHand(Card card) {
        hand.add(card);
    }

    public void showHand() {
        System.out.println(name + "'s hand:");
        for (Card card : hand) {
            System.out.print(card);
        }

}
}
