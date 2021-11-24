package npopov.Lab2;

import java.util.Scanner;

public class TaskCnum {

    public static int sumDigitsInNumber(int number) {
        return (number % 10) + (number % 100 - number % 10) / 10 + (number % 1000 - number % 100) / 100 + (number - number % 1000) / 1000;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = scanner.nextInt();
        System.out.println(sumDigitsInNumber(n));
    }
}
