package com.erwin.cards;

/**
 * This class help to get the correct Factory given the card type 
 * @author uresh
 */
public class CardFactoryProducer {

    /**
     * External class can't initialise
     */
    private CardFactoryProducer(){
    }
    
    /**
     * 
     * @param type - Represents Card type
     * @return CardFacotry - return the correct CardFacotory
     */
    public static CardFacotry getFacotiry(Card.Type type) {
        switch (type) {
            case POKER:
                return new PokerCardFactory();
            ///case: SCOPA: We can add other cards
            //    return new ScopaCardFactory();
            default:
                return new PokerCardFactory();
        }
    }

}
