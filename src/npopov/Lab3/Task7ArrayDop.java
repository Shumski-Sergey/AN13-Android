package npopov.Lab3;

import java.util.Scanner;

public class Task7ArrayDop {

    public static void arrayFilling(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 11);
        }
    }

    public static void arrayOutput(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public static int arrayNumber(int[] arr, int a) {
        int num = 0;
        for (int j : arr) {
            if (j == a) {
                num++;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        arrayFilling(arr);
        System.out.print("Массив: ");
        arrayOutput(arr);
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nВведите значение числа: ");
        int a = scanner.nextInt();
        System.out.println("Число с таким значением встречается: " + arrayNumber(arr, a));
    }
}
