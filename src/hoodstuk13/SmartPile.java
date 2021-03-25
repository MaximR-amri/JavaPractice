package hoodstuk13;

import java.util.ArrayList;

public class SmartPile extends ArrayList<Card> {

    public Card pop() {
        return this.remove(0);  // from the top of the pile
    }

    public void addDeck(Deck deck) {
        for (Card card : deck.getCards()) {
            this.add(card);
        }
    }
}
