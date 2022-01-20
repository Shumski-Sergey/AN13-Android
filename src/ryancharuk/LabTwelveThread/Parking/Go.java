package ryancharuk.LabTwelveThread.Parking;

import java.util.ArrayList;
import java.util.List;

public class Go {

	public static void main(String... args) {
		int carNumber = 8, parkedLimit = 5;
		Parking parking = new Parking(parkedLimit);
		List<Thread> carList = createCar(carNumber, parking);

		System.out.println(carList);

		startCars(carList);
		waitCars(carList);
		System.out.println();
		System.out.println(parking.getVisitedCar());
	}

	public static List<Thread> createCar(int carNumber, Parking parking) {
		List<Thread> carList = new ArrayList<>();
		for (int number = 0; number < carNumber; number++) {
			int waitTime = (int) (Math.random() * 25);
			int startTime = (int) (Math.random() * 5);
			int parkingTime = (int) (Math.random() * 25);
			carList.add(new Car(parkingTime, waitTime, startTime, parking));
		}
		return carList;
	}

	public static void waitCars(List<Thread> threads) {
		try {
			for (Thread thread : threads) thread.join();
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void startCars(List<Thread> threads) {
		for (Thread thread : threads) {
			thread.start();
		}
	}
}
