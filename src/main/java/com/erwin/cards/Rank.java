package com.erwin.cards;

/**
 * Interface used by card class. Represent the card rank
 * @author uresh
 */
public interface Rank{
    public String getValue();
    /**
     * Return the index. For sort
     * @return 
     */
    public int getIndex();
}
