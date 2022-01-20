package ryancharuk.LabTwelveThread.Parking;

public class Car extends Thread {

	private static int threadNumber = 0;
	private int parkingTime;
	private int waitTime;
	private int startTime;
	private Parking parking;
	private int number = ++ threadNumber;




	public int getWaitTime() {
		return waitTime;
	}

	public Car(int parkingTime, int waitTime, int startTime, Parking parking) {
		this.parkingTime = parkingTime;
		this.waitTime = waitTime;
		this.startTime = startTime;
		this.parking = parking;
	}

	@Override
	public void run() {

		try {
			wait(waitTime);
			boolean isAccepted = parking.accept(this);
			if (isAccepted) {
				System.out.println(this + " Нашёл место парковки");
				wait(parkingTime);
				parking.release(this);
			} else {
				System.out.println(this + " Не могу больше ждать, уехал");
			}
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}

	}

	public void wait(int seconds) throws InterruptedException {
		Thread.sleep(seconds * 1000L);
	}

	@Override
	public String toString() {
		return "Thread number: " + number +
				" startTime: " + startTime +
				" parkingTime: " + parkingTime +
				" waitTime: " + waitTime +
				"\n";
	}
}
