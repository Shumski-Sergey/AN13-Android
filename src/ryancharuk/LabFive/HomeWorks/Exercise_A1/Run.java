package ryancharuk.LabFive.HomeWorks.Exercise_A1;

public class Run {
	public static void main(String[] args) {
		Appliances fridge = new Fridge("Atlant", 150, true);
		KitchenAppliances kittle = new Kettle("Xiaomi",5,false);
		RoomAppliances tele = new Television("Samsung",25,false);
		TableLamp lamp = new TableLamp("Xiaomi",3,true);
		fridge.connected();
		fridge.info();

		kittle.connected();
		kittle.info();

		tele.connected();
		tele.info();

		lamp.connected();
		lamp.info();

	}
}
