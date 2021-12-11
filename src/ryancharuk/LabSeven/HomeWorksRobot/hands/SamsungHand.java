package ryancharuk.LabSeven.HomeWorksRobot.hands;

public class SamsungHand implements IHand {
	private int price;

	public SamsungHand(int price) {
		this.price = price;
	}

	public SamsungHand() {
	}

	@Override
	public void upHand() {
		System.out.println("Говорит рука Samsung, моя цена = "+ price);

	}

	@Override
	public int getPrice() {
		return price;
	}
}
