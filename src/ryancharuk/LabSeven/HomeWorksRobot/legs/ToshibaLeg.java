package ryancharuk.LabSeven.HomeWorksRobot.legs;

public class ToshibaLeg implements ILeg {
	private int price;

	public ToshibaLeg(int price) {
		this.price = price;
	}

	public ToshibaLeg() {
	}

	@Override
	public void step() {
		System.out.println("Говорит нога Toshiba, моя цена = "+ price);
	}

	@Override
	public int getPrice() {
		return price;
	}
}
