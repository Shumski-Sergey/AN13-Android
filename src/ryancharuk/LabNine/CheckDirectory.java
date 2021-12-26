package ryancharuk.LabNine;

import java.io.File;

public class CheckDirectory {
	public static void main(String[] args) {
		File file = new File("D:/сессия");
		String[] files = file.list();

		System.out.println("Listing contents of " + file.getPath());
		assert files != null;
		for (String s : files) {
			System.out.println(s);
		}
	}
}
