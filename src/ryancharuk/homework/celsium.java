package ryancharuk.homework;

import java.util.Scanner;

public class celsium {
	public static double convert(int celsium) {

		return (double) (celsium * 9 / 5) + 32;
	}

	public static int sumDigitsInNumber(int number) {
		int sum = 0;
		while (number != 0) {
			sum += (number % 10);
			number /= 10;
		}

		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.print("Введите градусы по цельсию: ");
//		System.out.println(convert(sc.nextInt()));
//		System.out.println(sumDigitsInNumber(sc.nextInt()));
	}
}
