package kvitko.Lab4;

import java.util.Scanner;

public class Task3 {
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
        int sred_length = 0;
        for (int i = 0; i < n; i++) {
            sred_length += str[i].length();
        }
        sred_length /= n;
        System.out.println("Средняя длина строк: " + sred_length);

        System.out.print("Строки, длина которых меньше средней: ");
        for (int i = 0; i < n; i++) {
            if (str[i].length() < sred_length)
                System.out.print(str[i] + " ");
        }
        System.out.println();

        System.out.print("Строки, длина которых больше средней: ");
        for (int i = 0; i < n; i++) {
            if (str[i].length() > sred_length)
                System.out.print(str[i] + " ");
        }
    }
}
