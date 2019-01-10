import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> deck;

    public Deck(){
        this.deck = this.populate();
    }

    private ArrayList<Card> populate() {
        ArrayList<Card> deck = new ArrayList<Card>();
        SuitType[] suits = SuitType.getAllValues();
        RankType[] ranks = RankType.getAllValues();
        for (SuitType suit : suits){
            for (RankType rank : ranks) {
                Card card = new Card(suit,rank);
                deck.add(card);
            }
        }
        return deck;
    }



    public int getDeckSize() {
        return this.deck.size();
    }
}
