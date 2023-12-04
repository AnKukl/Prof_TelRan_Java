package com.proftelran.Homework.Solitaire;

import com.proftelran.Homework.HW_PokerRefactoring.Rank;
import com.proftelran.Homework.HW_PokerRefactoring.Suits;

public class Card {
    private Rank rank;
    private Suits suits;

    public Card(Rank rank, Suits suits) {
        this.rank = rank;
        this.suits = suits;
    }

    public Rank getRank() {
        return rank;
    }

    public Suits getSuits() {
        return suits;
    }

    @Override
    public String toString() {
        return "  " + rank.getCardRank() + suits.getSuit();
    }
}
