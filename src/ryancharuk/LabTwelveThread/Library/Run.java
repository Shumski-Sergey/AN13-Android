package ryancharuk.LabTwelveThread.Library;

public class Run {
	public static void main(String[] args) {

		Reader reader = new Reader();

		Thread thread1 = new Thread(reader);
		Thread thread2 = new Thread(reader);
		Thread thread3 = new Thread(reader);
		Thread thread4 = new Thread(reader);

		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
	}
}
