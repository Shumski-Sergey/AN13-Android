package asemiakin.lab2;

import java.util.Scanner;

public class TaskB2 {
    public static double dis(int a, int b, int c) {
        return (b * b - 4 * a * c);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите исходные числа:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        double x1, x2, d = dis(a, b, c);
        if (d > 0) {
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Уравнение имеет два корня: " + x1 + " и " + x2);
        } else if (d == 0) {
            x1 = (-b) / (2 * a);
            System.out.println("Уравнение имеет один корень: " + x1);
        } else {
            System.out.println("Отрицательный дискриминант");
        }
    }
}
