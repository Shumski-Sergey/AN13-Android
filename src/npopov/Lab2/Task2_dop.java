package npopov.Lab2;

import java.util.Scanner;

public class Task2_dop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину стороны a: ");
        double a = scanner.nextDouble();
        System.out.println("Введите длину стороны b: ");
        double b = scanner.nextDouble();
        System.out.println("Введите длину стороны c: ");
        double c = scanner.nextDouble();

        if ((b + c) > a && (a + c) > b && (a + b) > c) {
            System.out.println("Треугольник с такими размерами существует");
        } else {
            System.out.println("Такого треугольника не существует");
        }
    }
}
