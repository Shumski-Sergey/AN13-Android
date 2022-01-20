package ryancharuk.LabSeven.HomeWorks.IlonMask.Shoes;

public class HumanShoes implements Shoes {
	boolean check = false;

	public HumanShoes(boolean check) {
		this.check = check;
	}

	public HumanShoes() {
	}

	@Override
	public void putOn() {
		System.out.println("Обувь надета");
		check = true;
	}

	@Override
	public void takeOff() {
		System.out.println("Обувь снята");
		check = false;
	}

	public boolean isCheck() {
		return check;
	}

}
