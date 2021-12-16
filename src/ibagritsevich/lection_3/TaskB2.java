package ibagritsevich.lection_3;

import java.util.Scanner;

public class TaskB2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите натуральное число: ");
        int number = scanner.nextInt();
        System.out.println("Делители натурального числа:" + number);
        for (int i = number; i > 0; i--) {
            int b = number % i;
            if (b == 0) {
                System.out.println(i + " ");
            }
        }
    }
}
