package com.proftelran.Homework.Solitaire;

import com.proftelran.Homework.HW_PokerRefactoring.Card;
import com.proftelran.Homework.HW_PokerRefactoring.Rank;
import com.proftelran.Homework.HW_PokerRefactoring.Suits;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Stack;

public class SolitaireApp {
    public static void main(String[] args) {

        final int numberOfCards = Suits.values().length * Rank.values().length;

        Random random = new Random();

        // Инициализация колоды
        List<Card> deck = new ArrayList<>();
        for (Suits suit : Suits.values()) {
            for (Rank rank : Rank.values()) {
                deck.add(new Card(rank, suit));
            }
        }

        // Перемешивание колоды
        for (int i = 0; i < numberOfCards; i++) {
            int card = i + (random.nextInt(numberOfCards - i));
            Card temp = deck.get(card);
            deck.set(card, deck.get(i));
            deck.set(i, temp);
        }

        //Раскладка колоды в стопку
        Stack<Card> stackOfCard = new Stack<>();
        for (Card element : deck) {
            if (!stackOfCard.isEmpty() && stackOfCard.peek().getSuits() == element.getSuits()) {
                stackOfCard.pop();
                continue;
            }
            stackOfCard.push(element);
        }
        //Вывод результата
        if (stackOfCard.size() == 4) {
            System.out.println("Excellent, you won!\nYour final stack: " + stackOfCard);
        }else System.out.println("Unfortunately, game over! \nYour final stack: " + stackOfCard);
    }
}