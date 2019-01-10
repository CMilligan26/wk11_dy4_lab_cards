import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    private Player player;
    private Card card;

    @Before
    public void before(){
        player = new Player("Frank");
        card = new Card(SuitType.SPADES, RankType.ACE);
    }

    @Test
    public void canReceiveCard(){
        player.receiveCard(card);
        assertEquals(card, player.getCard());
    }

    @Test
    public void hasName() {
        assertEquals("Frank", player.getName());
    }
}
