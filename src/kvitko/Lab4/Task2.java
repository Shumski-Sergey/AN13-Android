package kvitko.Lab4;

import java.util.Scanner;

public class Task2 {
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
        System.out.println("Ваши строки: ");
        for (int i = 0; i < n; i++) {
            System.out.print(str[i] + " ");
        }
        System.out.println();

        String st = new String();

        for (int i = 1; i < n; i++)
            for (int j = n - 1; j >= i; j--) {
                if (str[j - 1].length() > str[j].length()) {
                    st = str[j - 1];
                    str[j - 1] = str[j];
                    str[j] = st;
                }
            }
        System.out.println("Строки по возрастанию длины: ");
        for (int i = 0; i < n; i++) {
            System.out.print(str[i] + " ");
        }
        System.out.println();

        String st1 = new String();

        for (int i = 1; i < n; i++)
            for (int j = n - 1; j >= i; j--) {
                if (str[j - 1].length() < str[j].length()) {
                    st1 = str[j - 1];
                    str[j - 1] = str[j];
                    str[j] = st1;
                }
            }
        System.out.println("Строки по убыванию длины: ");
        for (int i = 0; i < n; i++) {
            System.out.print(str[i] + " ");
        }
    }
}