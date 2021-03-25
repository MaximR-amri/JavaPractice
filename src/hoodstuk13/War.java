package hoodstuk13;

public class War {

    Pile p = new Pile();

    static SmartPile p1 = new SmartPile();
    static SmartPile p2= new SmartPile();
    static SmartPile drawPile = new SmartPile();

    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();
        p1.addDeck(deck.subdeck(0, 25));
        p2.addDeck(deck.subdeck(26, 51));

        while (!p1.isEmpty() && !p2.isEmpty()) {
            // pop a card from each pile
            Card c1 = p1.pop();
            Card c2 = p2.pop();

            // compare the cards
            int diff = c1.getRank() - c2.getRank();
            if (diff > 0) {
                p1.add(c1);
                p1.add(c2);
            } else if (diff < 0) {
                p2.add(c1);
                p2.add(c2);
            } else {
                drawPile.add(c1);
                drawPile.add(c2);
                war();
            }

            System.out.printf("c1: %s, c2; %s \n",c1.toString(),c2.toString());
            System.out.printf("p1: %s, p2 %s, drawpile %s \n",p1.size(),p2.size(),drawPile.size());

        }

        if (p2.isEmpty()) {
            System.out.println("Player 1 wins!");
        } else {
            System.out.println("Player 2 wins!");
        }
    }

    public static void war() {
        if (p1.isEmpty()) return;
        if (p2.isEmpty()) return;
        if (drawPile.isEmpty()) return;
        for (int i = 0; i < 3; i++) {
            drawPile.add(p1.pop());
            if (p1.isEmpty()) return;
        }
        for (int i = 0; i < 3; i++) {
            drawPile.add(p2.pop());
            if (p2.isEmpty()) return;
        }
        Card c1 = p1.pop();
        Card c2 = p2.pop();
        drawPile.add(c1);
        drawPile.add(c2);
        int diff = c1.getRank() - c2.getRank();
        if (diff > 0) {
            p1.addAll(drawPile);
            drawPile.clear();
        } else if (diff < 0) {
            p2.addAll(drawPile);
            drawPile.clear();
        } else {
            war();
        }

    }


}
