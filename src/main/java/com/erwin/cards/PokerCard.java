package com.erwin.cards;


/**
 * Class representing a card from a standard 52 card deck
 * 
 * @author uresh
 */
public class PokerCard extends Card{
    /**
    * Construct a PokerCard with a given rank and suit.
    */
    public PokerCard(Rank rank, Suit suit) {
        super(rank, suit);
    }

    /**
    * ToString method
    * @return 
    */
    @Override
    public String toString(){
        return "PokerCard: " + rank.toString() + " of " + suit.toString();
    }
   
}
