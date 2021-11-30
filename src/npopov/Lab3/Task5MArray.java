package npopov.Lab3;

import java.util.Scanner;

public class Task5MArray {

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

    public static void matrixTransp(int[][] arr, int str, int stol) {
        for (int i = 0; i < str; i++) {
            for (int j = i+1; j < stol; j++) {
                int count = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = count;
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
        System.out.println("Матрица: ");
        arrayOutput(arr, str, stol);
        matrixTransp(arr, str, stol);
        System.out.println("Транспонированная матрица: ");
        arrayOutput(arr, str, stol);
    }
}
