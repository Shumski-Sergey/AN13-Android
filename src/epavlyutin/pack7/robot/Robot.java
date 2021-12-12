package epavlyutin.pack7.robot;

import epavlyutin.pack7.robot.Hand.IHand;
import epavlyutin.pack7.robot.Head.IHead;
import epavlyutin.pack7.robot.Leg.ILeg;

public class Robot implements calculated {
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

    public String getName() {
        return name;
    }

    @Override
    public void action() {
        head.speak();
        hand.upHand();
        leg.stepLeg();
    }

    @Override
    public int getPrice() {
        return head.getPrice() + hand.getPrice() + leg.getPrice();
    }

    public void overPrise() {
        System.out.println("Полная стоимость робота ".concat(getName()).concat(" равна ") + getPrice() + " рублей");
    }
}
