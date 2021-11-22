package npopov.Lab2;

import java.util.Scanner;

public class TaskA1_calc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = scanner.nextInt();
        System.out.println("Введите число: ");
        int b = scanner.nextInt();
        System.out.println((a + b) + " " + (a - b) + " " + a * b + " " + a / b + " " + a % b);
        System.out.println((double)(a + b) + " " + (double) (a - b) + " " + (double)(a * b) + " " +((double)a/ b) + " " + (double)(a % b));

    }
}
