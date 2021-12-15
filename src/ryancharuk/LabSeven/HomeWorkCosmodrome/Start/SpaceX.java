package ryancharuk.LabSeven.HomeWorkCosmodrome.Start;

import ryancharuk.LabSeven.HomeWorks.IlonMask.Human.Human;

public class SpaceX implements IStart{

	Human human;

	public SpaceX(Human human) {
		this.human = human;
	}

	public SpaceX() {
	}

	@Override
	public boolean systemCheck() {
		return human.isReady();
	}

	@Override
	public void engineStart() {
		System.out.println("Двигатели SpaceX запущены. Все системы в норме");
	}

	@Override
	public void start() {
		System.out.println("«Старт SpaceX»");
	}
}
