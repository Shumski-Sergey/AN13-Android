package kvitko.Lab6_7.Robot.ILeg;

public class Sony_leg  {
  public int price;
  public String leg, action;

    public Sony_leg(String leg, String action, int price) {
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

