package npopov.Lab2;

import java.util.Scanner;

public class Task4_dop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число a: ");
        double a = scanner.nextDouble();
        System.out.print("Введите число b: ");
        double b = scanner.nextDouble();
        System.out.print("Введите число c: ");
        double c = scanner.nextDouble();

        int num = 0;
        if (a > 0) { num++; }
        if (b > 0) { num++; }
        if (c > 0) { num++; }

        System.out.println("Количество положительных чисел: " + num);
    }
}
