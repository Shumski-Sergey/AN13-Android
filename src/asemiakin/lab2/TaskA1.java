package asemiakin.lab2;

import java.util.Scanner;

public class TaskA1 {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число:");
        a = scanner.nextInt();
        System.out.print("Введите второе число:");
        b = scanner.nextInt();
        System.out.println("Сумма = " + (a + b) + ' ' + (double) (a + b)  +
                ", Разность = " + (a - b) + ' ' + (double) (a - b) +
                ", Произведение = " + (a * b)  + ' ' + (double) (a * b) +
                ", Частное = " + (a / b) + ' ' + (double) (a / b) +
                ", Остаток от деления = " + (a % b) + ' ' + (double) (a % b));
    }
}
