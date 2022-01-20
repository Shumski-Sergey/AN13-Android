package ryancharuk.LabTwelveThread.Parking;

import java.util.ArrayList;
import java.util.List;

public class Parking {


	private int carLimit;
	private List<Thread> parkedCars = new ArrayList<>();
	private List<Thread> visitedCar = new ArrayList<>();

	public Parking(int carLimit) {
		this.carLimit = carLimit;
	}

	public List<Thread> getVisitedCar() {
		return visitedCar;
	}

	public synchronized boolean accept(Car thread) throws InterruptedException {
		while (carLimit == 0) {
			wait(thread.getWaitTime());
			if (carLimit == 0) return false;
			else break;
		}
		carLimit--;
		parkedCars.add(thread);
		notifyAll();
		return true;
	}

	public synchronized void release(Car thread) {
		if (parkedCars.contains(thread)) {
			visitedCar.add(thread);
			carLimit++;
			parkedCars.remove(thread);
		}
	}
}
