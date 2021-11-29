package lkovsher.Lab3;

import java.util.Random;
import java.util.Scanner;

public class Task1_1_5 {
    public static void main(String[] args) {
        int max = 50, sum = 0, productNumber1 = 0,productNumber2 = 0, chooseTask = 0;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Введите размер квадратной матрицы:");
        int n = scanner.nextInt();
        int[][] array = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                array[i][j] = random.nextInt(max) +1;
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }
        while(chooseTask != 6) {
            System.out.print("Выберите решение задач 1-5 или завершите программу 6:");
            chooseTask = scanner.nextInt();
            switch (chooseTask) {
                case 6:{ System.out.print("\n" + "Работа завершена.");
                    break;
                }
                case 1: {
                    for (int i = 0; i < n; i++) {
                        if (array[i][i] % 2 == 0) {
                            sum = sum + array[i][i];
                        }
                    }
                    System.out.print("\n" + "1) Сумма четных элементов главной диагонали матрицы равна: " + sum + "\n");
                    break;
                }
                case 2: {
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n; j++) {
                            if (i >= j && array[i][j] % 2 == 0) {
                                sum = sum + array[i][j];
                            }
                        }
                    }
                    System.out.print("\n" + "2) Сумма четных элементов, находящихся под главной диагональю включительно:" + sum + "\n");
                    break;
                }
                case 3: {
                    for (int i = 0; i < n; i++) {
                        productNumber1 = productNumber1 + array[i][i];
                    }

                    for (int j = (n - 1); j >= 0; j--) {
                        productNumber2 = productNumber2 + array[j][j];
                    }
                    if (productNumber1 > productNumber2)
                        System.out.print("\n" + "3) Произведение элементов главной диагонали матрицы больше, чем побочной." + "\n");
                    else if (productNumber2 > productNumber1)
                        System.out.print("\n" + "3) Произведение элементов побочной диагонали матрицы больше, чем главной." + "\n");
                    else
                        System.out.print("\n" + "3) Произведение элементов главной и побочной диагонали матрицы равны." + "\n");
                    break;
                }
                case 4: {
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n - i - 1; j++) {
                            if (array[i][j] % 2 == 0) {
                                sum = sum + array[i][j];
                            }
                        }
                    }
                    System.out.print("\n" +"4) Сумма четных элементов, находящихся над побочной диагональю не включительно:" + sum + "\n");
                    break;
                }
                case 5: {
                    System.out.print("\n");
                    for (int i = 0; i < n; i++) {
                        for (int j = i + 1; j < n; j++) {
                            int temp = array[i][j];
                            array[i][j] = array[j][i];
                            array[j][i] = temp;
                        }
                    }
                    System.out.println("\n" + "5) Транспонированная матрица:");
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n; j++) {
                            System.out.print(array[i][j] + " ");
                        }
                        System.out.print("\n");
                    }
                    break;
                }
                default: {
                    break;
                }
            }
        }

    }
}
