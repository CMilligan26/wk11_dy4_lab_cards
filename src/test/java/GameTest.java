import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    private Game game;
    private Deck deck;
    private Player player1;
    private Player player2;

    @Before
    public void before() {
        deck = new Deck();
        player1 = new Player("Pablo");
        player2 = new Player("Kingston");
        game = new Game(deck, player1, player2);
    }

    @Test
    public void hasDeckAndPlayers(){
        assertEquals(deck, game.getDeck());
        assertEquals(player1, game.getPlayer1());
        assertEquals(player2, game.getPlayer2());
    }
}
