import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    private Deck deck;

    @Before
    public void before(){
        deck = new Deck();
    }

    @Test
    public void canPopulateDeck(){
        assertEquals(52, deck.getDeckSize());
    }
//
//    @Test
//    public void canDeal(){
//        assertEquals(2, deck.deal.size());
//    }
}
