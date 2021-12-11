package ryancharuk.LabSeven.HomeWorksRobot.heads;

public class ToshibaHead implements IHead {
	private int price;

	public ToshibaHead(int price) {
		this.price = price;
	}
	public ToshibaHead() {
	}

	@Override
	public void speek() {
		System.out.println("Говорит голова Toshiba, моя цена = "+ price);

	}

	@Override
	public int getPrice() {
		return price;
	}
}
