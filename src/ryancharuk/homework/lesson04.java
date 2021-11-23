package ryancharuk.homework;

import java.util.Scanner;

public class lesson04 {
	public static void discriminant(int a, int b, int c) {
		double d = b * b - 4 * a * c;
		if (d > 0) {
			double x1, x2;
			x1 = (- b - Math.sqrt(d)) / (2 * a);
			x2 = (- b + Math.sqrt(d)) / (2 * a);
			System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
		} else if (d == 0) {
			double x = (double) -b /(2 * a);
			System.out.println("Уравнение имеет единственный корень: x = " + x);
		}
		else {
			System.out.println("Уравнение не имеет действительных корней!");
		}

		}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		discriminant(sc.nextInt(),sc.nextInt(), sc.nextInt());
	}
}
