package kvitko.Lab3.Homework;

import java.util.Scanner;

public class MatrixTask4 {
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
            System.out.print("Cуммa четных элементов стоящих над побочной диагональю (не включительно): ");

            int sum=0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if(a[i][j]%2==0) sum+=a[i][j];
                }
            }
            System.out.println(sum);
        } else System.out.println("Матрица должна быть квадратной");
    }
}

