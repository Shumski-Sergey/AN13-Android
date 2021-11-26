package asemiakin.lab3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.print("Введите целое число, которое требуется вывести в бухгалтерском формате: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.printf("Результат - %,d", number);
    }
}
