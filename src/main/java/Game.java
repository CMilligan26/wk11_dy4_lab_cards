import java.util.ArrayList;

public class Game {
    private Deck gameDeck;
    private Player player1;
    private Player player2;

    public Game(Deck gameDeck, Player player1, Player player2){
        this.gameDeck = gameDeck;
        this.player1 = player1;
        this.player2 = player2;
        this.startGame();
        System.out.println(this.declareWinner().getName() + " is the winner");
    }


    public Deck getDeck() {
        return this.gameDeck;
    }

    public Player getPlayer1() {
        return this.player1;
    }

    public Player getPlayer2() {
        return this.player2;
    }

    private void startGame(){
        ArrayList<Card> playerCards = new ArrayList<Card>();
        playerCards = this.gameDeck.deal();
        this.player1.receiveCard(playerCards.get(0));
        this.player2.receiveCard(playerCards.get(1));
    }

    private Player declareWinner(){
        int player1Value = player1.getCard().getRank().getValue();
        int player2Value = player2.getCard().getRank().getValue();
        if (player1Value > player2Value) {
            return player1;
        }
        else
        {
            return player2;
        }
    }
}
