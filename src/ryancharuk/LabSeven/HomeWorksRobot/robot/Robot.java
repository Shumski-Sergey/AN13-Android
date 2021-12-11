package ryancharuk.LabSeven.HomeWorksRobot.robot;


import ryancharuk.LabSeven.HomeWorksRobot.hands.IHand;
import ryancharuk.LabSeven.HomeWorksRobot.heads.IHead;
import ryancharuk.LabSeven.HomeWorksRobot.legs.ILeg;

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

	public Robot(String name) {
		this.name = name;
	}

	public Robot() {
	}

	public String getName() {
		return name;
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

	@Override
	public void action() {
		head.speek();
		hand.upHand();
		leg.step();
	}

	/**
	 * Get the cost of a robot
	 *
	 * @return int
	 */
	@Override
	public int getPrice() {
		return head.getPrice() + hand.getPrice() + leg.getPrice();
	}

	public void sort(Robot robot1, Robot robot2, Robot robot3) {
		Robot[] robotMass = {robot1, robot2, robot3};
		int max = 0;
		int emp = 0;
		for (int i = 0; i < robotMass.length; i++) {
			if (max < robotMass[i].getPrice()) {
				max = robotMass[i].getPrice();
				emp = i;
			}
		}
		System.out.println("Cамый дорогой робот - ".concat(robotMass[emp].getName()).concat(", его цена = ".concat(String.valueOf(max))));
	}

}

