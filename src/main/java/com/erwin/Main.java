/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erwin;

import com.erwin.deck.Deck;
import com.erwin.cards.Card;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author uresh
 */
public class Main {

    public static void main(String[] args) {
        Deck deck = new Deck(Card.Type.POKER);
        List<Card> cardList = null;
        String menu = "1. Shuffle the deck - press 1\n2. Draw cards from deck - "
                + "press 2\n3. Draw cards from deck and sort - press 3\n4. Reset - press 4\n5. exit - press 5";
        boolean loop = true;
        while (loop) {
            System.out.println(menu);
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            int num = 0;
            switch (choice) {
                case 1:
                    deck.shuffle();
                    cardList = deck.getCards();
                    for (Card card : cardList) {
                        System.out.println(card.toString());
                    }
                    break;
                case 2:
                    System.out.println("How many cards would you like to draw?");
                    scanner = new Scanner(System.in);
                    num = scanner.nextInt();
                    cardList = deck.getCardsByNum(num);
                    for (Card card : cardList) {
                        System.out.println(card.toString());
                    }
                    break;
                case 3:
                    System.out.println("How many cards would you like to draw?");
                    scanner = new Scanner(System.in);
                    num = scanner.nextInt();
                    cardList = deck.getSortedCards(num);
                    for (Card card : cardList) {
                        System.out.println(card.toString());
                    }
                    break;
                case 4:
                    deck = new Deck(Card.Type.POKER);
                    break;
                case 5:
                    loop = false;
                    break;
                default:
                    System.out.println("Please, insert a number from 1 to 5");
            }
        }
    }

}
