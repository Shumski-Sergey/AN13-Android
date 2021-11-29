package kvitko.Laba3.Homework;

import java.util.Scanner;

public class AddTask2 {
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

        int number = 0, sred=0;
        for (int i = 0; i < a.length; i++)
            if (i % 2 == 1) {
                sred+=a[i];
                number++;
            }
        sred/=number;
        System.out.println("Среднее арифметическое элементов с нечётными номерами: "+sred);
    }
}
