package kvitko.Lab6_7.Robot.IHand;

public class Samsung_hand {
    int price;
    String hand,action;

    public Samsung_hand(String hand, String action, int price) {
        this.hand = hand;
        this.price = price;
        this.action=action;
    }

    public String getHand() {
        return hand;
    }

    public int getPrice() {
        return price;
    }

    public String getAction() {
        return action;
    }
}
