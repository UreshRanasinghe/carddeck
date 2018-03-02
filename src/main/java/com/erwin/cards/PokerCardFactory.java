package com.erwin.cards;

import java.util.ArrayList;
import java.util.List;

/**
 * This class extends CardFactory to create the PokerCard List
 *
 * @author uresh
 */
public class PokerCardFactory implements CardFacotry {

    /**
     * Enum representing Poker card rank.
     */
    private enum PokerRank implements Rank {
        Two(0), Three(1), Four(2), Five(3), Six(4), Seven(5), Eight(6), Nine(7), Ten(8), Knight(9), Queen(10), King(12), Ace(13);
        /**
         * Index for sort
         */
        private final int index;
        /**
         * String value of the enum
         */
        private final String value;

        private PokerRank(int index) {
            this.index = index;
            this.value = this.toString();
        }

        @Override
        public String getValue() {
            return this.value;
        }

        @Override
        public int getIndex() {
            return this.index;
        }
    }

    /**
     * Enum representing Poker card suit.
     */
    private enum PokerSuit implements Suit {
        Clubs(0), Spades(1), Hearts(2), Diamonds(3);
        /**
         * Index for sort
         */
        private final int index;

        private final String value;

        private PokerSuit(int index) {
            this.index = index;
            this.value = this.toString();
        }

        @Override
        public String getValue() {
            return this.value;
        }

        @Override
        public int getIndex() {
            return this.index;
        }
    }

    public PokerCardFactory() {
    }

    /**
     * Generate the full poker type card list
     * @return poker type card list
     */
    @Override
    public List<Card> getCards() {
        List<Card> result = new ArrayList<>();
        PokerRank[] pokerRanks = PokerRank.values();
        PokerSuit[] pokerSuits = PokerSuit.values();
        for (PokerRank pokerRank : pokerRanks) {
            for (PokerSuit pokerSuit : pokerSuits) {
                result.add(new PokerCard(pokerRank, pokerSuit));
            }
        }
        return result;
    }

}
