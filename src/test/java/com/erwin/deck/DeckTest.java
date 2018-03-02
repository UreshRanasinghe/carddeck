package com.erwin.deck;

import com.erwin.cards.Card;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author uresh
 */
public class DeckTest {
    private Deck deck;
    

    @Before
    public void setUpDeck() {
        deck = new Deck(Card.Type.POKER);
    }
 
    @Test
    public void deckShouldBeShuffled() {
        List<Card> cards = new ArrayList<>(deck.getCards());
        deck.shuffle();
        assertTrue(!cards.equals(deck.getCards()));
    }
    
    @Test
    public void shouldDrawCards() {
        deck.getCardsByNum(10);
        assertEquals(42, deck.cardsLeft());
    }
    
    @Test
    public void shouldDrawSortedCards() {
        List<Card> originalList = deck.getCardsByNum(10);
        List<Card> sortedList = new ArrayList<>(originalList);
        sortedList = deck.sortCards(sortedList);
        assertTrue(!originalList.equals(sortedList));
    }
    
}
