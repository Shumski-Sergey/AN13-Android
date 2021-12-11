package ryancharuk.LabSeven.HomeWorksRobot.hands;

public class ToshibaHand implements IHand{
	private int price;

	public ToshibaHand(int price) {
		this.price = price;
	}

	public ToshibaHand() {
	}

	@Override
	public void upHand() {
		System.out.println("Говорит рука Toshiba, моя цена = "+ price);

	}

	@Override
	public int getPrice() {
		return price;
	}
}
