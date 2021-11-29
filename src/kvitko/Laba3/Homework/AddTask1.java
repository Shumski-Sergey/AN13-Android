package kvitko.Laba3.Homework;

import java.util.Scanner;

public class AddTask1 {
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
        int p = 1;
        for (int i = 0; i < a.length; i++)
            if (a[i] % 3 == 0 && a[i] != 0) p *= a[i];
        System.out.println("Произведение чисел, кратных 3: " + p);

    }
}
