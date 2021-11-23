package lkovsher.Lab2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int numberPositive=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = scanner.nextInt();
        System.out.println("Введите число:");
        int b = scanner.nextInt();
        System.out.println("Введите число:");
        int c = scanner.nextInt();
        if(a > 0) numberPositive++;
        if(b > 0) numberPositive++;
        if(c > 0) numberPositive++;
        System.out.println("Количество положительных чисел:" + numberPositive);

    }
}
