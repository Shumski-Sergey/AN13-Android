package ryancharuk.LabSix.HomeWorks.Task2;

public class Run {
	public static void main(String[] args) {
		BigAnimal dragon = new Dragon();
		SmallAnimal goose = new Goose();
		System.out.println("Дракон - ".concat(dragon.getSize()));
		System.out.println("Гусь - ".concat(goose.getSize()));
	}

}
