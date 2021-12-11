package ryancharuk.LabSeven.HomeWorksRobot.hands;

public class SonyHand implements IHand{
	private int price;

	public SonyHand(int price) {
		this.price = price;
	}

	public SonyHand() {
	}

	@Override
	public void upHand() {
		System.out.println("Говорит рука Sony, моя цена = "+ price);
	}

	@Override
	public int getPrice() {
		return price;
	}
}
