package ryancharuk.LabTwelveThread;

public class myThread implements Runnable {
	String name;

	public myThread(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		System.out.printf("%s started... \n", Thread.currentThread().getName());
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			System.out.println("Thread has been interrupted");
		}
		System.out.printf("%s finish... \n", Thread.currentThread().getName());
	}
}

