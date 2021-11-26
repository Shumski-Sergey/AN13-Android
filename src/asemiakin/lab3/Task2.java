package asemiakin.lab3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.print("Введите целое число: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number == 1) {
            System.out.println("1 является одновременно и не простым и не составным числом");
            return;
        }
        if (number > 1) {
            int i = number - 1;
            while (i > 1) {
                if (number % i == 0) {
                    System.out.println("Данное число является составным.");
                    break;
                }
                i--;
            }
            if (i == 1) System.out.println("Данное число является простым.");
        } else System.out.println("Ошибка! Введите положительное число.");
    }
}
