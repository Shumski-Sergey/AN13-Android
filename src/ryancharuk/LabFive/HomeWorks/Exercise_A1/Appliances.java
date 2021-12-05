package ryancharuk.LabFive.HomeWorks.Exercise_A1;

public  abstract class Appliances {
	private String brand;
	private int weight;

	private boolean works;

	public Appliances(String name, int weight, boolean works) {
		this.brand = name;
		this.weight = weight;
		this.works = works;
	}

	public String getName() {
		return brand;
	}

	public int getWeight() {
		return weight;
	}

	public boolean isWorks() {
		return works;
	}
	public void connected() {
		if (isWorks()){
			System.out.println("Прибор подключён к розетке");
		}
		else {
			System.out.println("Прибор не подключён к розетке");
		}
	}

	public void info (){
		System.out.printf("Брэнд: %s \t Вес: %d кг\n\n", getName(), getWeight());
	}
}
