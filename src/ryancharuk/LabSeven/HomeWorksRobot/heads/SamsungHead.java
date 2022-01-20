package ryancharuk.LabSeven.HomeWorksRobot.heads;

public class SamsungHead implements IHead {
	private int price;

	public SamsungHead(int price) {
		this.price = price;
	}

	public SamsungHead() {
	}

	@Override
	public void speek() {
		System.out.println("Говорит голова Samsung, моя цена = "+ price);

	}

	@Override
	public int getPrice() {
		return price;
	}
}
