package ryancharuk.LabFour;

import java.util.Scanner;

public class Exercise_3 {

	private static int getMean(Scanner scan, String[] mass) {
		int mean;
		int all = 0;
		for (int i = 0; i < mass.length; i++) {
			mass[i] = scan.next();
			all += mass[i].length();
		}
		mean = all / mass.length;
		return mean;
	}

	public static void main(String[] args) {

		// Без внятного ТЗ - результат хз))) (длинна которой меньше (больше) средней)

		Scanner scan = new Scanner(System.in);
		System.out.print("Введите количество строк:");
		int count = scan.nextInt();
		int middle;
		String[] mass = new String[count];

		System.out.println("Введите строки: ");
		middle = getMean(scan, mass);

		// Выводит все что не равняется среднему значению всех строк,
		// можно менять знак перед middle для большего или меньшего значения.
		for (String s : mass) {
			if (s.length() != middle) {
				System.out.println("Строка: ".concat(s) + ", длинна строки = " + s.length());
			}
		}

	}


}
