package kvitko.Lab3.Homework;

import java.util.Scanner;

public class MatrixTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число строк матрицы: ");
        int n = scanner.nextInt();
        System.out.print("Введите число столбцов матрицы: ");
        int m = scanner.nextInt();
        if (n == m) {
            int a[][] = new int[n][m];
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    a[i][j] = (int) (Math.random() * 50);
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++)
                    System.out.print(a[i][j] + " ");
                System.out.println();
            }

            int sum = 0;
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    if (i == j) sum += a[i][j];
                }
            }
            System.out.println("Сумма элементов на главной диагонали: " + sum);
        } else System.out.println("Матрица должна быть квадратной");
    }
}
