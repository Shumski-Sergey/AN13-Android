package npopov.Lab2;

import java.util.Scanner;

public class TaskB2 {

    public static double dis(int a, int b, int c) {
        return b * b - 4 * a * c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = scanner.nextInt();
        System.out.println("Введите число: ");
        int b = scanner.nextInt();
        System.out.println("Введите число: ");
        int c = scanner.nextInt();

        double disk = dis(a, b, c);
        System.out.println();

        if (disk < 0) {
            System.out.println("Отрицательный дискриминант");
        }
        if (disk > 0) {
            double x1 = (-(double) b + Math.sqrt(disk)) / (2 * a);
            double x2 = (-(double) b - Math.sqrt(disk)) / (2 * a);
            System.out.println("x1: " + x1 + " " + "x2: " + x2);
        }
        if (disk == 0) {
            double x = (-(double) b) / (2 * a);
            System.out.println("x: " + x);
        }
    }
}
