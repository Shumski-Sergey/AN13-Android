package npopov.Lab4;

import java.util.Scanner;

public class TaskStr1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк: ");
        int n = scanner.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Введите строку: ");
            str[i] = scanner.next();
            System.out.print("");
        }
        String maxLine = " ", minLine;
        for (int i = 0; i < n; i++) {
            if (maxLine.length() < str[i].length()) {
                maxLine = str[i];
            }
        }
        minLine = maxLine;
        for (int i = 0; i < n; i++) {
            if (minLine.length() > str[i].length()) {
                minLine = str[i];
            }
        }
        System.out.println("Наибольшая строка: ".concat(maxLine));
        System.out.println("Наименьшая строка: ".concat(minLine));
    }
}
