package ryancharuk.LabTwo;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();


		System.out.println((a + b) + " " + (a - b) + " " + (a * b) + " " + (a / b));
		System.out.println ((double)(a + b) + " " + (double)(a - b) + " " +
				(double)(a * b) + " " +(double) (a / b) + " " + (double)(a % b));
	}
}
