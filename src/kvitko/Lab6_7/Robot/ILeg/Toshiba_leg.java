package kvitko.Lab6_7.Robot.ILeg;

import kvitko.Lab6_7.Robot.Actions;

public class Toshiba_leg implements Leg, Actions {
    int price;
    String leg, action;

    public Toshiba_leg(String leg, String action, int price) {
        this.leg = leg;
        this.action=action;
        this.price = price;

    }

    public String getLeg() {
        return leg;
    }

    public int getPrice() {
        return price;
    }

    public String getAction() {
        return action;
    }
}
