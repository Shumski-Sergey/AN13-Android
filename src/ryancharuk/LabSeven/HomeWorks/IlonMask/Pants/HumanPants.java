package ryancharuk.LabSeven.HomeWorks.IlonMask.Pants;

public class HumanPants implements Pants {
	boolean check;

	public HumanPants(boolean check) {
		this.check = check;
	}

	public HumanPants() {
	}

	@Override
	public void putOn() {
		System.out.println("Штаны надеты");
		check = true;
	}

	@Override
	public void takeOff() {
		System.out.println("Штаны сняты");
		check = false;
	}

	public boolean isCheck() {

		return check;
	}
}

