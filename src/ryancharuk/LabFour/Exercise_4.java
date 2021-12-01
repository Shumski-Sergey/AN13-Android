package ryancharuk.LabFour;

import java.util.Scanner;

public class Exercise_4 {
	private static int diffWords(String st) {
		StringBuilder a = new StringBuilder();
		String b;
		for (int i = 0; i < st.length(); i++) {
			b = String.valueOf(st.charAt(i));
			if (a.indexOf(b) == - 1)
				a.append(b);
		}
		return a.length();
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Введите количество строк: ");
		int countNumber = sc.nextInt();
		String[] mass = new String[countNumber];
		System.out.println("Введите строки: ");
		for (int i = 0; i < mass.length; i++) {
			mass[i] = sc.next();
		}
		String coal = mass[0];

		for (String s : mass) {
			if (diffWords(s) < diffWords(coal)) {
				coal = s;
			}
		}
		System.out.println("Искомое слово: ".concat(coal) + ", число различных символов = " + diffWords(coal));
	}
}
