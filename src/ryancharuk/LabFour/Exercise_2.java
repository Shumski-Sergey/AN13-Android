package ryancharuk.LabFour;

import java.util.Scanner;

public class Exercise_2 {
	private static void sortBubble(Scanner in, int countStr, String[] arr) {
		for (int i = 0; i < countStr; i++) {
			arr[i] = in.next();
		}

		for (int i = arr.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {

				if (arr[j].length() > arr[j + 1].length()) {
					String tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}
		}
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Введите количество строк: ");
		int countStr = in.nextInt();
		String[] arr = new String[countStr];
		System.out.println("Введите строки:");


		sortBubble(in, countStr, arr);

		for (String s : arr) {
			System.out.println(s);
		}
	}


}

