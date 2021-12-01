package kvitko.Lab4;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int n = scanner.nextInt();
        String[] str = new String[n];
        Scanner scanner1 = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Введите строку №" + (i + 1) + ": ");
            str[i] = scanner1.nextLine();
        }

        }
    }
