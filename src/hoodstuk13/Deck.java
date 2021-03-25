package hoodstuk13;

import java.util.Random;

public class Deck {

    private Card[] cards;

    // Constructoe to create an empty array of cards with n positions
    public Deck(int n){
        this.cards = new Card[n];
    }

    // Constructoer to create a deck
    public Deck() {
        this.cards = new Card[52];
        int index=0;
        for (int suit = 0; suit <=3; suit++){
            for (int rank = 1; rank <= 13;rank++) {
                cards[index] = new Card(rank,suit);
                index++;
            }
        }
    }

    // Cards Getter
    public Card[] getCards() {
        return this.cards;
    }

    // method to show the deck
    public void showDeck() {
        for(Card card: cards) {
            System.out.println(card);
        }
    }

    // method to shuffle the deck
    public void shuffle() {
        int swapCard;
        for (int i = 0;i < cards.length; i++){
            swapCard = randomInt(i,cards.length-1);
            swapCards(i,swapCard);
        }
    }

    //method to generate a random int
    private static int randomInt(int low, int high) {
        Random random = new Random();
        return random.nextInt(high + 1 - low) + low;
    }

    // method to swap 2 cards
    private void swapCards(int i, int j) {
        Card temp = cards[i];
        cards[i] = cards[j];
        cards[j] = temp;
    }

    // method to find lowest card in a given range of deck
    public int indexLowest(int low, int high){
        int lowest = low;
        for(int i = low + 1; i <= high; i++){
            if ( this.cards[i].compareTo(this.cards[lowest])== -1){
                lowest = i;
            }
        }
        return lowest;
    }

    // selectionSort method
    public void selectionSort(){
        int lowest;
        for(int i = 0;i < this.cards.length-1; i++){
            lowest = indexLowest(i, this.cards.length-1);
            swapCards(i, lowest);
        }
    }

    // method to merge two sorted decks
    public static Deck merge(Deck d1, Deck d2){
        Deck result = new Deck(d1.cards.length + d2.cards.length);
        Card winner;
        int i = 0;  //counter for first deck
        int j = 0;  //counter for second deck
        for (int k = 0; k < result.cards.length; k++){
            if (i == d1.cards.length){
                winner = d2.cards[j];
                j++;
            } else if(j == d2.cards.length){
                winner = d1.cards[i];
                i++;
            } else {
                if(d1.cards[i].compareTo(d2.cards[j]) == -1){
                    winner = d1.cards[i];
                    i++; }
                else {
                    winner = d2.cards[j];
                    j++; }
            }
            result.cards[k] = winner;

        }
        return result;
    }

    // method to create subdecks
    public Deck subdeck(int low, int high){
        Deck sub = new Deck(high - low + 1);
        for (int i = 0; i < sub.cards.length;i++){
            sub.cards[i] = this.cards[low + i];
        }
        return sub;
    }

    // simple version of mergeSort
    public Deck mergeSortSimple(){
        Deck sub1 = this.subdeck(0,25);
        Deck sub2 = this.subdeck(26,51);
        sub1.selectionSort();
        sub2.selectionSort();
        return merge(sub1,sub2);
    }

    // recursive version of mergeSort
    public Deck mergeSort(){
        int len = cards.length;
        if (len == 0 || len == 1){
            return this;
        }
        else {
            int mid = len / 2;
            Deck d1 = subdeck(0, mid - 1).mergeSort();
            Deck d2 = subdeck(mid, len -1).mergeSort();
            return merge(d1, d2);
        }
    }

}
