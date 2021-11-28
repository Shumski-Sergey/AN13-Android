package ibagritsevich.lection_3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input number: ");
        int num = scanner.nextInt();
        int sum = 0;
        while (num != 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println("Сумма чисел: " + sum);
    }
}
