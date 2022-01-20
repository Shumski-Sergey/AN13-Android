package ryancharuk.LabFive.HomeWorks.Exercise_3;

public abstract class Calc {

	public void ref(long rub, char penny) {
		String a = Long.toString(rub);
		String b = a + "," + penny;
		System.out.println(b);
	}


}
