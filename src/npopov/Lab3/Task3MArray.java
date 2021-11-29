package npopov.Lab3;

import java.util.Scanner;

public class Task3MArray {

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

    public static int arrayMultiplicationFirst(int[][] arr, int str, int stol) {
        int mul = 1; //произведение
        for (int i = 0; i < str; i++) {
            for (int j = 0; j < stol; j++) {
                if (i == j) {
                    mul *= arr[i][j];
                }
            }
        }
        return mul;
    }

    public static int arrayMultiplicationSecond(int[][] arr, int str, int stol){
        int mul2 = 1; //произведение
        int j = str - 1;
        for (int i = 0; i < str; i++) {
                mul2 *= arr[i][j];
                j--;
        }
        return mul2;
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
        System.out.println("Произведение элементов главной диагонали: " + arrayMultiplicationFirst(arr, str, stol));
        System.out.println("Произведение элементов побочной диагонали: " + arrayMultiplicationSecond(arr, str, stol));
    }
}
