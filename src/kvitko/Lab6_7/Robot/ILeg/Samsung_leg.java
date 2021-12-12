package kvitko.Lab6_7.Robot.ILeg;



public class Samsung_leg {
    int price;
    String leg, action;

    public Samsung_leg(String leg, String action, int price) {
        this.leg = leg;
        this.price = price;
        this.action=action;
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
