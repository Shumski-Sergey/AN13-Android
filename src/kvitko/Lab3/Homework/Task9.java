package kvitko.Lab3.Homework;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int k = scanner.nextInt();
        int a[] = new int[k];
        boolean r = true;
        if (k % 2 != 0) r = false;
        if (r) {
            for (int i = 0; i < a.length; i++) {
                a[i] = (int) (Math.random() * 15);
            }

            for (int i : a)
                System.out.print(i + " ");

            System.out.println();

            int sum1 = 0, sum2 = 0;
            for (int i = 0; i < a.length / 2; i++)
                sum1 += a[i];
            System.out.println("Сумма левой части: " + sum1);

            for (int i = a.length - 1; i >= a.length / 2; i--)
                sum2 += a[i];
            System.out.println("Сумма правой части: " + sum2);

            if (sum1 > sum2) System.out.println("Сумма левой части больше");
            else if (sum1 < sum2) System.out.println("Сумма правой части больше");
            else System.out.println("Суммы частей равны");
        }
        else System.out.println("Неверное число");
    }
}
