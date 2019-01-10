public class Runner {

    public static void main(String[] args) {
        Deck deck = new Deck();
        Player player1 = new Player("Pablo");
        Player player2 = new Player("Kingston");
        Game game = new Game(deck, player1, player2);
    }
}
