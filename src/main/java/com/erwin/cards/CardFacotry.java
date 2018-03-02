package com.erwin.cards;

import java.util.List;

/**
 * Factory Pattern representing a CardFacotory
 * @author uresh
 */
public interface CardFacotry {
    /**
     * Return cards list
     * @return cards - Full list of cards
     */
    public List<Card> getCards();
    
}
