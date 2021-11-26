package asemiakin.lab3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.print("Введите целое число: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println("Сумма цифр данного числа = " + sum);
    }
}
