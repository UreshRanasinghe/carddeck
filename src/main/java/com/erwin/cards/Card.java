package com.erwin.cards;

/**
 * Class representing a playing card. This class can be extended from other class to create new Cards.
 * 
 * @author uresh
 */
public abstract class Card {
    /**
    * Enum representing card type.
    */
    public enum Type{POKER;};
    /**
    * Represents card rank
    */
    protected Rank rank;
    /**
    * Represents card suit
    */
    protected Suit suit;
    
    /**
    * Construct a Card with a given rank and suit.
    */
    public Card(Rank rank, Suit suit){
        if(rank == null || suit == null){
            throw new IllegalArgumentException("Argument can't be null");
        }
        this.rank = rank;
        this.suit = suit;
    }
    
    /**
     * Return  the card's rank
     * @return rank - card rank
     */
     public Rank getRank() {
        return rank;
    }

     /**
      * Return the card's suit
      * @return suit - card suit
      */
    public Suit getSuit() {
        return suit;
    }

}
