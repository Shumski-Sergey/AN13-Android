package ryancharuk.LabSeven.HomeWorks.IlonMask.Jacket;

public class HumanJacket implements Jacket {

	boolean check = false;

	public HumanJacket(boolean check) {
		this.check = check;
	}

	public HumanJacket() {
	}

	@Override
	public void putOn() {
		System.out.println("Куртка надета");
		check = true;
	}

	@Override
	public void takeOff() {
		System.out.println("Курта снята");

		check = false;
	}
	public boolean isCheck(){
		return check;
	}
}
