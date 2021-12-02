package ibagritsevich.lection_3;

import java.util.Scanner;

public class TaskB1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = scanner.nextInt();
        int res = 1;
        for (int i = 1; i <= num; i++)
            res = res * i;
        System.out.println("Факториал числа: " + res);
    }
}
