package ryancharuk.LabThree.HomeWorkThree;

import java.util.Scanner;

public class ExerciseB {

	static int calculateFactorial(int n) {
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result = result * i;
		}
		return result;
	}

	public static void main(String[] args) {

		//B.1
		Scanner sc = new Scanner(System.in);
//		System.out.print("Введите число: ");
//		int a = sc.nextInt();
//		System.out.println("Факториал числа: " + a + " :" + calculateFactorial(a));

		//B2

		int b;
		System.out.println("Введите натуральное число: ");
		if (sc.hasNextInt()) {
			b = sc.nextInt();
			for (int i = b; i > 0; -- i) {
				int c = b % i;
				if (c == 0){
					System.out.print(i+" ");
				}

			}
		} else {
			System.out.println("Ошибка: Введено не число!");
		}

	}
}
