package ryancharuk.LabThree.HomeWork;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ExerciseA {
	public static Boolean check = true;
	static Scanner sc = new Scanner(System.in);

	public static int sumDigitsInNumber(int number) {
		int sum = 0;
		while (number != 0) {
			sum += (number % 10);
			number /= 10;
		}

		return sum;
	}

	public static void accFormat(long number) {
		Locale log = new Locale("ru");
		NumberFormat format = NumberFormat.getInstance(log);
		String result = format.format(number);
		System.out.println(result);
	}

	public static void main(String[] args) {

		//A.1
//		System.out.println(sumDigitsInNumber(22));

	      //A.2
//
//			int b;
//			int a = sc.nextInt();
//			for (int i = 2; i <= a/2; i++) {
//				b = a % i;
//				if (b  == 0) {
//					check = false;
//					break;
//				}
//			}
//		if (check){
//			System.out.println("Простое число");
//		}
//		else {
//			System.out.println("Составное число");
//		}

		//A.3
//		accFormat(22003322);


	}
}
