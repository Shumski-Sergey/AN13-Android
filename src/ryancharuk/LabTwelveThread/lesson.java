package ryancharuk.LabTwelveThread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

public class lesson {
	public static void main(String[] args) throws InterruptedException {

		Runnable task = ()->{
			System.err.println("Will be Park");
			LockSupport.park();
			System.err.println("UnParked");
		};
		Thread thread = new Thread(task);
		thread.start();

		Thread.sleep(2000);
		System.err.println("Thread state: " + thread.getState());

		LockSupport.unpark(thread);
		Thread.sleep(2000);
	}
}
