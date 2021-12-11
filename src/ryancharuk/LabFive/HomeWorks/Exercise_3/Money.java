package ryancharuk.LabFive.HomeWorks.Exercise_3;

public class Money {
	private long rub;
	private int penny;

	public Money(long rub, int penny) {
		this.rub = rub;
		this.penny = penny;
	}

	public long getRub() {
		return rub;
	}

	public int getPenny() {
		if (penny >= 100)
		rub += 1;
		penny-= 100;
		return penny;
	}

	public void sub (Money money, Money money2){
		Money money1 = new Money(money.getRub() - money2.getRub(), money.getPenny()- money2.getPenny());
		System.out.println(money1.getRub()+ ","+ money1.getPenny());
	}




}
