package kvitko.Lab3.Homework;

import java.util.Scanner;

public class MatrixTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число строк матрицы: ");
        int n = scanner.nextInt();
        System.out.print("Введите число столбцов матрицы: ");
        int m = scanner.nextInt();
        int a[][] = new int[n][m];
        if (n==m){
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
        System.out.print("Нечётные элементы, стоящие ниже главной диагонали(включительно): ");

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if((i==j||i>j) && a[i][j]%2==1) System.out.print(a[i][j]+" "); ;
            }
        }
    } else System.out.println("Матрица должна быть квадратной");
}
}

