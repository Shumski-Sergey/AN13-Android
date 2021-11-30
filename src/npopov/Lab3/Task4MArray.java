package npopov.Lab3;

import java.util.Scanner;

public class Task4MArray {

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

    public static int arraySumElement(int[][] arr, int str, int stol) {
        int sum = 0;
        for (int i = 0; i < str - 1; i++) {
            for (int k = 0; k < stol - 1 - i; k++) {
                if ((arr[i][k] % 2) == 0) {
                    sum += arr[i][k];
                }
            }
        }
        return sum;
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
        System.out.println("Сумма элементов: " + arraySumElement(arr, str, stol));
    }
}
