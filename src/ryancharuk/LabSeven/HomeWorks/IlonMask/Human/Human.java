package ryancharuk.LabSeven.HomeWorks.IlonMask.Human;

import ryancharuk.LabSeven.HomeWorks.IlonMask.Jacket.HumanJacket;
import ryancharuk.LabSeven.HomeWorks.IlonMask.Pants.HumanPants;
import ryancharuk.LabSeven.HomeWorks.IlonMask.Shoes.HumanShoes;


public class Human implements IHuman {

	private HumanJacket jacket;
	private HumanPants pants;
	private HumanShoes shoes;
	private String name;

	public Human(HumanJacket jacket, HumanPants pants, HumanShoes shoes, String name) {
		this.jacket = jacket;
		this.pants = pants;
		this.shoes = shoes;
		this.name = name;
	}

	public Human() {
	}

	public HumanJacket getJacket() {
		return jacket;
	}

	public HumanPants getPants() {
		return pants;
	}

	public HumanShoes getShoes() {
		return shoes;
	}

	public String getName() {
		return name;
	}

	@Override
	public void getDressed() {
		if (jacket.isCheck() & pants.isCheck() & shoes.isCheck()) {
			jacket.putOn();
			pants.putOn();
			shoes.putOn();
			System.out.println("Все вещи были надеты ");
		} else {
			System.out.println("Вы что-то забыли надеть");
		}

	}


	@Override
	public void undress() {
		if (!(jacket.isCheck() & pants.isCheck() & shoes.isCheck())) {
			jacket.takeOff();
			pants.takeOff();
			shoes.takeOff();
			System.out.println("Все вещи были сняты ");
		} else {
			System.out.println("Вы что-то забыли снять");
		}
	}
}
