package vikonnikova.lab4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество строк: ");
        int countStr = sc.nextInt();
        System.out.println("Строка №1: ");
        String maxLine = sc.next();
        String minLine = maxLine;
        for (int i = 1; i < countStr; i++) {
            System.out.println("Введите строку №" + (i+1));
            String next = sc.next();
            if (maxLine.length() < next.length()) {
                maxLine = next;
            } else if (minLine.length() > next.length()) {
                minLine = next;
            }
        }
        System.out.println("MaxLine = ".concat(maxLine));
        System.out.print("MinLine = ".concat(minLine));
    }
}

