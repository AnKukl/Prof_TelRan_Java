package com.proftelran.Homework.HW_PokerRefactoring;

import java.util.*;

public class Deal {public static void main(String[] args) {

    final int cardsForPlayer = 5;
    int players;

    final Scanner scanner = new Scanner(System.in);
    final Random random = new Random();

    final int numberOfCards = Suits.values().length * Rank.values().length; // Количество карт

    while (true) {
        System.out.println("Введите количество игроков: ");

        if (scanner.hasNextInt()) {
            players = scanner.nextInt();
            if (cardsForPlayer * players <= numberOfCards) {
                break;
            } else {
                if (players == 0) {
                    System.out.println("Игра прекращена");
                    break;
                } else if (players < 0) {
                    System.out.println("Количество игроков не может бать ниже 0");
                } else {
                    System.out.println("Слишком много игроков");
                }
            }
        } else {
            System.out.println("Вы не ввели количество игроков");
        }
    }

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

    // Раздача карт каждому игроку
    List<Player> playersList = new ArrayList<>();
    for (int i = 0; i < players; i++) {
        playersList.add(new Player("\nИгрок №" + (i + 1)));
    }

    int cardIndex = 0;
    for (Player player : playersList) {
        for (int i = 0; i < cardsForPlayer; i++) {
            Card card = deck.get(cardIndex);
            player.addCardToHand(card);
            cardIndex++;
        }
    }

    // Вывод карт игроков
    for (Player player : playersList) {
        player.showHand();
    }
}
}
