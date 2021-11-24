package npopov.Lab2;

import java.util.Scanner;

public class Task6_dop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число a: ");
        double a = scanner.nextDouble();
        System.out.print("Введите число b: ");
        double b = scanner.nextDouble();
        if (a < b) {
            System.out.println("Наибольшее число: " + a);
        } else if (a > b) {
            System.out.println("Наибольшее число: " + b);
        } else {
            System.out.println("Числа равны");
        }
    }
}
