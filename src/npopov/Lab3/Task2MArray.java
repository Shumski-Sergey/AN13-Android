package npopov.Lab3;

import java.util.Scanner;

public class Task2MArray {

    public static void arrayFilling(int[][] arr, int str, int stol) {
        for (int i = 0; i < str; i++) {
            for (int j = 0; j < stol; j++) {
                arr[i][j] = (int) (Math.random() * 51);
            }
        }
    }

    public static void arrayOutput(int[][] arr, int str, int stol) {
        for (int i = 0; i < str; i++) {
            for (int j = 0; j < stol; j++) {
                System.out.print(" " + arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void arrayFindElement(int[][] arr, int str, int stol) {
        for (int i = 0; i < str; i++) {
            for (int j = 0; j < stol; j++) {
                if ((i >= j) && ((arr[i][j] % 2) != 0)) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк: ");
        int str = scanner.nextInt();                            //строки
        System.out.println("Введите количество столбцов: ");
        int stol = scanner.nextInt();                           //столбцы
        int[][] arr = new int[str][stol];
        arrayFilling(arr, str, stol);
        arrayOutput(arr, str, stol);
        arrayFindElement(arr, str, stol);
    }
}
