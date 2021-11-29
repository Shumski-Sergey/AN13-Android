package nshekov.lesson3;

import java.util.Scanner;

public class TaskDoubleArrays {
    public static void main(String[] args) {
        System.out.println("Введите размер квадратной матрицы:");
        Scanner sc = new Scanner(System.in);
        int matrix = sc.nextInt();
        int[][] array = new int[matrix][matrix];
        for (int i = 0; i < matrix; i++) {
            for (int j = 0; j < matrix; j++) {
                array[i][j] = (int) (Math.random() * 50);
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        task1(array, matrix);
        task2(array, matrix);
        task3(array, matrix);
        task4(array, matrix);
        task5(array, matrix);
    }

    static void task1 (int[][] array, int matrix){
        int sum = 0;
        for (int i = 0; i < matrix; i++) {
            if (array[i][i] % 2 == 0) {
                sum += array[i][i];
            }
        }
        System.out.println("Сумма чётных элементов главной диагонали равна " + sum);
        System.out.println();
    }

    static void task2 (int[][] array, int matrix){
        System.out.println("Нечетные числа ниже главной диагонали (включительно):");
        for (int i = 0; i < matrix; i++) {
            for (int j = 0; j < matrix; j++) {
                if (j > i) {
                    break;
                } else if (array[i][j] % 2 == 1){
                    System.out.print(array[i][j] + " ");
                }
            }
        }
        System.out.println("\n");
    }

    static void task3 (int[][] array, int matrix){
        int product1 = 1;
        int product2 = 1;
        for (int i = 0; i < matrix; i++) {
            product1 *= array[i][i];
            product2 *= array[i][matrix - 1 - i];
        }
        if (product1 > product2) {
            System.out.println("Произведение чисел главной диагонали больше");
        } else if (product1 < product2){
            System.out.println("Произведение чисел побочной диагонали больше");
        } else {
            System.out.println("Произведения чисел обеих диагоналей равны");
        }
        System.out.println();
    }

    static void task4 (int[][] array, int matrix){
        int sum = 0;
        for (int i = 0; i < matrix - 1; i++) {
            for (int j = 0; j < matrix; j++) {
                if (i < j && array[i][j] % 2 == 0){
                    sum += array[i][j];
                }
            }
        }
        System.out.println("Сумма четных элементов стоящих выше главной диагонали равна " + sum);
        System.out.println();
    }

    static void task5 (int[][] array, int matrix){
        int [][] transArray = new int[matrix][matrix];
        System.out.println("Транспонированная матрица:");
        for (int i = 0; i < matrix; i++) {
            for (int j = 0; j < matrix; j++) {
                transArray[i][j] = array[j][i];
                System.out.print(transArray[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
