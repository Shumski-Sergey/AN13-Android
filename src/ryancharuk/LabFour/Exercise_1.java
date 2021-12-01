package ryancharuk.LabFour;

import java.util.Scanner;


public class Exercise_1 {

	private static void MaxMinLine(Scanner sc, int countStr, String maxLine, String min) {
		for (int i = 1; i < countStr; i++) {
			String next = sc.next();
			if (maxLine.length() < next.length()) {
				maxLine =  next;
			}
			else if (min.length() > next.length()){
				min = next;

			}
		}
		System.out.println("Самая длинная строка: ".concat(maxLine));
		System.out.println("Самая короткая строка: ".concat(min));
	}


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//task 1

		System.out.print("Введите количество строк: ");
		int countStr = sc.nextInt();
		System.out.println("Введите строки:");
		String maxLine = sc.next();
		MaxMinLine(sc, countStr, maxLine, maxLine);


	}


}
