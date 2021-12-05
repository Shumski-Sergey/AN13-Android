package ryancharuk.LabFive.HomeWorks.Exercise_A2;

public class Go {
	public static void main(String[] args) {

		Card zp = new SolaryCard(221, "Visa", 356.2, true);
		DebitCard overZp = new Overdraft(333, "Master", 780, false);
		CreditCard credit = new CreditCard(111, "MIR", 1500, false);

		zp.info();
		zp.calcCash(25);
		System.out.println(zp.getBalance());

		overZp.info();
		overZp.calcCash(25);

		credit.info();
		credit.calcCash(25);

	}
}
