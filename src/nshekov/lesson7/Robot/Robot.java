package nshekov.lesson7.Robot;

import nshekov.lesson7.Robot.Hand.IHand;
import nshekov.lesson7.Robot.Head.IHead;
import nshekov.lesson7.Robot.Leg.ILeg;

public class Robot implements Realisable{
    private IHead head;
    IHand hand;
    ILeg leg;
    private String name;

    public Robot(IHead head, IHand hand, ILeg leg, String name) {
        this.head = head;
        this.hand = hand;
        this.leg = leg;
        this.name = name;
    }

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    @Override
    public void action() {
        head.speak();
        hand.upHand();
        leg.stepLeg();
    }

    @Override
    public int getPrice() {
        return head.getPrise() + hand.getPrice() + leg.getPrice();
    }
}
