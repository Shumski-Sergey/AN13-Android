package ryancharuk.LabFive.HomeWorks.Exercise_A2;

public class Card {

	private int numberCard;
	private String name;
	private double balance;
	private boolean casBack;
	private double percentCash = 0.05;


	public Card(int numberCard, String name, double balance, boolean casBack) {
		this.numberCard = numberCard;
		this.name = name;
		this.balance = balance;
		this.casBack = casBack;
	}

	public boolean isCasBack() {
		return casBack;
	}

	public int getNumberCard() {
		return numberCard;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public void info (){
		System.out.printf("Номер карты: %d \t Название карты: %s \t Баланс = %f\n", getNumberCard(),getName(),getBalance());
	}

	public double getPercentCash() {
		return percentCash;
	}

	public void setPercentCash(double percentCash) {
		this.percentCash = percentCash;
	}

	public void calcCash (double price){
		if (isCasBack()){
			double cash = price * getPercentCash();
			System.out.printf("Ваш кэшбэк составляет =  %f\n" , cash);
		}
		else {
			System.out.println("В этой карте нет функции кэшбэк, для подключения обратитесь в банк \n");
		}
	}
}
