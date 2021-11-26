package npopov.Lab3;

import java.util.Scanner;

public class Task_1_cycle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = scanner.nextInt();
        int sum = 0;
        while (a != 0) {
            sum += (a % 10);
            a /= 10;
        }
        System.out.println(sum);
    }
}
