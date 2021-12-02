package ibagritsevich.lection_2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три стороны треугольника: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int sum = 0;
        if (a + b > c && a + c > b && c + b > a) {
            System.out.println("Треугольник существует");
        } else System.out.println("Треугольник не может существовать");
    }
}
