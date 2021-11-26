package asemiakin.lab3;

import java.util.Scanner;

public class TaskB1 {
    public static void main(String[] args) {
        System.out.print("Введите натуральное число, факториал которого требуется вычислить: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number == 0) {
            System.out.println("Факториал введённого числа = 1");
        } else if (number < 0) {
            System.out.println("Ошибка! Введите натуральное число.");
        } else {
            int f = 1;
            for (int i = number; i > 1; i--) {
                f *= i;
            }
            System.out.println("Факториал введённого числа = " + f);
        }
    }
}
