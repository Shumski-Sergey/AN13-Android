package vabramchuk.Lab7.Lab_Robot;

import vabramchuk.Lab7.Lab_Robot.hands.IHand;
import vabramchuk.Lab7.Lab_Robot.heads.IHead;
import vabramchuk.Lab7.Lab_Robot.legs.ILeg;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void outRobot(){
        action();
        getPrice();
}

    @Override
    public void action() {
        System.out.println("Робот ".concat(name).concat(":"));
        head.speek();
        hand.upHand();
        leg.step();
    }

    @Override
    public int getPrice() {
        return head.getPrice() + hand.getPrice() + leg.getPrice();
    }

    private void FinalPrice() {
        System.out.println("Этот робот стоит " + getPrice() + " У.Е.\n");
    }

    public void FinalRobot(){
        action();
        FinalPrice();
    }
}
