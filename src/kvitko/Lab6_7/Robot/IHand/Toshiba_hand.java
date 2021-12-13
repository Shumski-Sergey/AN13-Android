package kvitko.Lab6_7.Robot.IHand;

import kvitko.Lab6_7.Robot.Actions;

public class Toshiba_hand implements Hand, Actions {
    int price;
    String hand,action;

    public Toshiba_hand(String hand, String action, int price) {
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
