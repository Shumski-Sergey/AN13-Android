package kvitko.Laba3.Homework;

import java.util.Scanner;

public class MatrixTask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер матрицы: ");
        int n = scanner.nextInt();
        int a[][] = new int[n][n];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = (int) (Math.random() * 50);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(a[i][j] + " ");
            System.out.println();
        }
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < a.length; i++) {
            if (i == i) sum1 += a[i][i];
        }
        System.out.println("Сумма элементов на главной диагонали:"+sum1);

            for (int i=0; i<a.length; i++){
                sum2 += a[i][n-i-1];
            }
        System.out.println("Сумма элементов на побочной диагонали:"+sum2);
            if (sum1>sum2) System.out.println("Сумма на главной диагонали больше");
            else if (sum1<sum2) System.out.println("Сумма на побочной диагонали больше");
            else System.out.println("Суммы равны");
        }

    }

