package ryancharuk.LabEleven;

public class LessonThread {
	public static void main(String[] args) {
		Thread thread = new Thread(()->{
			for (int i = 0; i < 3; i++) {
				System.out.println(i + " ");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		thread.start();
	}
}
