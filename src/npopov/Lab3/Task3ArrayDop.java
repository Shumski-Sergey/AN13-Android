package npopov.Lab3;

import java.util.Scanner;

public class Task3ArrayDop {

    public static void arrayFilling(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
    }

    public static void arrayOutput(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public static double arrayAverage(int[] arr, int c) {
        int sum = 0;
        int num = 0;
        for (int j : arr) {
            if (j > c) {
                sum += j;
                num++;
            }
        }
        return (double) sum / num;
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        arrayFilling(arr);
        System.out.print("Массив: ");
        arrayOutput(arr);
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nВведите число: ");
        int c = scanner.nextInt();
        System.out.println("Cреднее арифметическое элементов: " + arrayAverage(arr, c));
    }
}
