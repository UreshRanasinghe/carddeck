package com.erwin.deck;

import com.erwin.cards.CardFactoryProducer;
import com.erwin.cards.CardFacotry;
import com.erwin.cards.Card;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Class representing a deck of cards
 *
 * @author uresh
 */
public class Deck {

    /**
     * List of cards
     */
    private final List<Card> cards = new ArrayList<>();
    /**
     * CardFactory used to get the card list
     */
    private final CardFacotry cardFacotry;

    /**
     * Construct a deck given the card type
     *
     * @param cardType - card type
     */
    public Deck(final Card.Type cardType) {
        this.cardFacotry = CardFactoryProducer.getFacotiry(cardType);
        this.cards.addAll(this.cardFacotry.getCards());
    }

    /**
     * Draw any given number of cards from the deck
     *
     * @param num - number of cards
     * @return List of card
     */
    public List<Card> getCardsByNum(int num) {
        List<Card> ret = new ArrayList<>();
        for (int i = 0; i < num && cardsLeft() > 0; i++) {
            ret.add(cards.remove(0));
        }
        return ret;
    }

    /**
     * Draw any given number of cards from the deck and then sort the drawn
     * cards
     *
     * @param num - number of card
     * @return List of card
     */
    public List<Card> getSortedCards(int num) {
        return sortCards(getCardsByNum(num));
    }

    /**
     * Return the number of the card left in the deck
     *
     * @return Number of the card left
     */
    public int cardsLeft() {
        return cards.size();
    }

    /**
     * Sorted cards are sorted by suit: Clubs, Spades, Hearts, Diamonds; then by value: Ace is high.
     * @param list - card list to sort
     * @return  Sorted card list
     */
    public List<Card> sortCards(List<? extends Card> list) {
        Collections.sort(list, new Comparator() {

            public int compare(Object o1, Object o2) {

                Integer suit1 = ((Card) o1).getSuit().getIndex();
                Integer suit2 = ((Card) o2).getSuit().getIndex();
                int suitComp = suit1.compareTo(suit2);

                if (suitComp != 0) {
                    return suitComp;
                } else {
                    Integer index1 = ((Card) o1).getRank().getIndex();
                    Integer index2 = ((Card) o2).getRank().getIndex();
                    return index1.compareTo(index2);
                }
            }
        });

        return new ArrayList<Card>(list);
    }

    /**
     * Shuffle the deck, leaving the cards in a random order.
     */
    public void shuffle() {
        Collections.shuffle(cards);
    }

    public List<Card> getCards() {
        return cards;
    }
    
    
}
