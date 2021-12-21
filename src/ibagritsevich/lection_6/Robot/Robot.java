package ibagritsevich.lection_6.Robot;

import ibagritsevich.lection_6.Robot.hands.IHand;
import ibagritsevich.lection_6.Robot.heads.IHead;
import ibagritsevich.lection_6.Robot.legs.ILeg;

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

    public Robot(){}

    public IHead getHead() { return head; }

    public void setHead(IHead head) { this.head = head; }

    public IHand getHand() { return hand; }

    public void setHand(IHand hand) { this.hand = hand; }

    public ILeg getLeg() { return leg; }

    public void setLeg(ILeg leg) { this.leg = leg; }

    public String getName() {return name; }

    @Override
    public void action() {
        head.Speek();
        hand.upHand();
        leg.Step();
    }

    /**
     * Get the cost of a robot
     * @return int
     */

    @Override
    public int getPrice() {
        return head.getPrice() + hand.getPrice() + leg.getPrice();
    }

    public void PrintPrice() {
        System.out.println("Стоимость робота,$ : " + getName() + " = " + getPrice());
    }
    public void RobotAction() {
        System.out.println("\n" + getName() + ":");
        action();
    }
}