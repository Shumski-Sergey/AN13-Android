package ryancharuk.LabFive.HomeWorks.Exercise_A1;

public class Television extends RoomAppliances {
	public Television(String name, int weight, boolean works) {
		super(name, weight, works);
	}

	@Override
	public void connected() {
		if (isWorks()){
			System.out.println("Телевизор подключён к розетке");
		}
		else {
			System.out.println("Телевизор не подключён к розетке");
		}
	}
}
