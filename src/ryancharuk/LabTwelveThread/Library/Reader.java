package ryancharuk.LabTwelveThread.Library;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Reader implements Runnable {
	private final Library book1 = new Library("Отцы и дети", false, false);
	private final Library book2 = new Library("Ведьмак", false, false);
	private final Library book3 = new Library("Над пропастью во ржи", false, false);
	private final Library book4 = new Library("Мастер и Маргарита", false, false);
	private final List<Library> listBook = new ArrayList<>(Arrays.asList(book1, book2, book3, book4));


	@Override
	public void run() {
		Library book = listBook.get((int) (Math.random() * 4));
		if (book.isHands() & book.isReadArea()) {
			synchronized (this) {
				System.out.println(Thread.currentThread().getName() + " Wait the book: " + book.getNameBook());
				try {
					Thread.currentThread().join(1400);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		book.setHands(true);
		book.setReadArea(true);
		System.out.println(Thread.currentThread().getName() + " Booked up: " + book.getNameBook());
			try {
				if (book.isHands()){
					Thread.currentThread().join(8000);
				}
				else if (book.isReadArea()){
					Thread.currentThread().join(4500);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			book.setReadArea(false);
			book.setHands(false);

			run();
	}
}
