package ryancharuk.LabSeven.HomeWorksRobot.legs;

public class SamsungLeg implements ILeg {
	private int price;

	public SamsungLeg(int price) {
		this.price = price;
	}

	public SamsungLeg() {
	}

	@Override
	public void step() {
		System.out.println("Говорит нога Samsung, моя цена = "+ price);
	}

	@Override
	public int getPrice() {
		return price;
	}
}
