package ibagritsevich.lection_4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите n строк: ");
        int count = scanner.nextInt();
        System.out.println("Введите строки: ");
        String Strings = scanner.next();
        MaxMinStr(scanner, count, Strings, Strings);
    }

    private static void MaxMinStr(Scanner scanner, int count, String Max, String Min) {
        for (int i = 1; i < count; i++) {
            String next = scanner.next();
            if (Max.length() < next.length()) {
                Max = next;
            } else if (Min.length() > next.length()) {
                Min = next;
            }
        }
        System.out.println("Самая длинная строка: " + Max);
        System.out.println("Самая короткая строка: " + Min);
    }
}
