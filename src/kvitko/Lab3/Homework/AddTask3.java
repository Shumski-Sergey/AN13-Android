package kvitko.Lab3.Homework;

import java.util.Scanner;

public class AddTask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = scanner.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++)
            a[i] = (int) (Math.random() * 20);

        for (int i : a)
            System.out.print(i + " ");

        System.out.println();

        System.out.print("Введите число: ");
        int c = scanner.nextInt();

        int sred = 0, number = 0;
        for (int i = 0; i < a.length; i++)
            if (a[i] > c) {
                sred += a[i];
                number++;
            }
        sred /= number;
        System.out.println("Среднее арифметическое чисел, больших введённого числа: " + sred);
    }
}
