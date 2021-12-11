package npopov.Lab7.Robot;

import npopov.Lab7.Robot.hands.IHand;
import npopov.Lab7.Robot.heads.IHead;
import npopov.Lab7.Robot.legs.ILeg;

public class Robot implements IRobot {
    private IHead head;
    private IHand hand;
    private ILeg leg;
    private String name;

    public Robot(IHead head, IHand hand, ILeg leg, String name) {
        this.head = head;
        this.hand = hand;
        this.leg = leg;
        this.name = name;
    }

    public Robot() {
    }

    public IHead getHead() {
        return head;
    }

    public void setHead(IHead head) {
        this.head = head;
    }

    public IHand getHand() {
        return hand;
    }

    public void setHand(IHand hand) {
        this.hand = hand;
    }

    public ILeg getLeg() {
        return leg;
    }

    public void setLeg(ILeg leg) {
        this.leg = leg;
    }

    public String getName() { return name; }

    @Override
    public void action() {
        System.out.println("Робот ".concat(name).concat(":"));
        head.speak();
        hand.upHand();
        leg.step();
    }

    @Override
    public int getPrice() {
        return head.getPrice() + hand.getPrice() + leg.getPrice();
    }

    private void outPutPrice() {
        System.out.println("Этот робот стоит " + getPrice() + " рублей\n");
    }

    public void outPutRobot(){
        action();
        outPutPrice();
    }
}
