package ryancharuk.LabSeven.HomeWorksRobot.legs;

public class SonyLeg implements ILeg{
	private int price;

	public SonyLeg(int price) {
		this.price = price;
	}

	public SonyLeg() {
	}

	@Override
	public void step() {
		System.out.println("Говорит нога Sony, моя цена = "+ price);

	}

	@Override
	public int getPrice() {
		return price;
	}
}
