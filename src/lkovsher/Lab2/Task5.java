package lkovsher.Lab2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int numberPositive=0;
        int numberNegative=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = scanner.nextInt();
        System.out.println("Введите число:");
        int b = scanner.nextInt();
        System.out.println("Введите число:");
        int c = scanner.nextInt();
        if(a > 0) {
            numberPositive++;
        } else if ( a < 0) numberNegative++;
        if(b > 0) {
            numberPositive++;
        } else if (b < 0) numberNegative++;
        if(c > 0) {
            numberPositive++;
        } else if (c < 0) numberNegative++;

        System.out.println("Количество положительных чисел:" + numberPositive + "\n" + "Количество отрицательных чисел:" + numberNegative );

    }
}
