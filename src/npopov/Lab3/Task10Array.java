package npopov.Lab3;

import java.util.Scanner;

public class Task10Array {

    public static void arrayFilling(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (n + 1));
        }
    }

    public static void arrayOutput(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public static int arrayCheck(int[] arr1) {
        int num = 0;                                  //количество четных элементов
        for (int j : arr1) {
            if (j % 2 == 0) {
                num++;
            }
        }
        return num;
    }

    public static void arrayTwoFilling(int[] arr1, int num) {
        int[] arr2 = new int[num];
        int buffer = -1;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = buffer + 1; j < arr1.length; j++) {
                if (arr1[j] % 2 == 0) {
                    arr2[i] = arr1[j];
                    buffer = j;
                    break;
                }
            }
        }
        System.out.println("\nВторой массив: ");
        arrayOutput(arr2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число больше 3: ");
        int n = scanner.nextInt();
        int[] arr1 = new int[n];
        int num;
        if (n <= 3) {
            System.out.println("Вы ввели не то число");
        } else {
            arrayFilling(arr1, n);
            System.out.print("Первый массив: ");
            arrayOutput(arr1);
            num = arrayCheck(arr1);
            arrayTwoFilling(arr1, num);
        }
    }
}
