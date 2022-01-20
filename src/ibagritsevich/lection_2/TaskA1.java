package ibagritsevich.lection_2;

import java.util.Scanner;

public class TaskA1 {
    public static void main(String[] args) {
        System.out.println("Калькулятор");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 2 числа:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Введены числа " + a + " и " + b);
        System.out.println("\nСумма: " + (a + b) + " " + "Разность: " + (a - b) + " " + "Произведение: " + (a * b) + " "
                + "Частное: " + (a / b) + " " + "Остаток от деления: " + (a % b));
        System.out.println("\nСумма: " + (double) (a + b) + " " + "Разность: " + (double) (a - b) + " " + "Произведение: " +
                (double) (a * b) + " " + "Частное: " + (double) (a / b) + " " + "Остаток от деления: " + (double) (a % b));

    }
}