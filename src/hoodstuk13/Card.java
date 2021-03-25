package hoodstuk13;

public class Card {
    private static final String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};

    private static final String[] RANKS = {null,"Ace", "2", "3", "4", "5", "6",
            "7", "8", "9", "10", "Jack", "Queen", "King"};

    private final int rank;
    private final int suit;

    private static int indexOf(String[] array,String val) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null && array[i].equals(val)) {
                return i;
            }
        }
        return -1;
    }

    public Card(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public Card(String rank, String suit) {

        this.rank = indexOf(RANKS,rank);
        this.suit = indexOf(SUITS,suit);
        if (this.rank <0 || this.suit<0) {
            throw new IllegalArgumentException("Warning! Alarm! Can not construct card");
        }
    }

    public boolean equals(Card that){
        return this.rank == that.rank && this.suit == that.suit;
    }

    public String toString() {
        return "Card{" +
                "rank=" + RANKS[rank] +
                ", suit=" + SUITS[suit] +
                '}';
    }

    public int compareTo(Card that){
        if (this.suit < that.suit) {
            return -1;
        }
        if (this.suit > that.suit) {
            return 1;
        }
        if (this.rank < that.rank) {
            return -1;
        }
        if (this.rank > that.rank) {
            return 1;
        }
        return 0;
    };


}
