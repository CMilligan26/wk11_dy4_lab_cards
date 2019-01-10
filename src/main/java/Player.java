public class Player {

    private Card playerCard;
    private String playerName;

    public Player(String name){
        this.playerName = name;
    }

    public void receiveCard(Card card) {
        this.playerCard = card;
    }

    public Card getCard() {
        return this.playerCard;
    }

    public String getName() {
        return this.playerName;
    }
}
