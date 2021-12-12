package ryancharuk.LabSeven.HomeWorkCosmodrome;

import ryancharuk.LabSeven.HomeWorkCosmodrome.Start.IStart;

import java.util.Timer;

public class Cosmodrome   {

	private IStart Shuttle;

	public Cosmodrome(IStart shuttle) {
		Shuttle = shuttle;
	}

	public Cosmodrome() {
	}

	public IStart getShuttle() {
		return Shuttle;
	}

	public void launch (IStart start) throws InterruptedException {
		if (start.systemCheck()){
			start.engineStart();
			System.out.println("Обратный отсчёт:");
			for (int i = 10; i > 0; i--) {
				System.out.println(i + ".....");
				Thread.sleep(1000);
			}
			start.start();
		}
		else {
			System.out.println("Предстартовая проверка провалена");
		}
	}

}
