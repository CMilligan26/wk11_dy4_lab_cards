import java.util.ArrayList;
import java.util.Collections;

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

    public ArrayList<Card> deal() {
        this.shuffle();
        ArrayList<Card> playerCards = new ArrayList<Card>();
        playerCards.add(this.deck.get(0));
        playerCards.add(this.deck.get(1));
        return playerCards;
    }

    private void shuffle(){
        Collections.shuffle(this.deck);
    }
}
