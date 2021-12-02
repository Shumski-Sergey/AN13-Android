package asemiakin.lab4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int countStr = scanner.nextInt();
        System.out.print("Строка №1: ");
        String maxLine = scanner.next();
        String minLine = maxLine;
        for (int i = 2; i <= countStr; i++) {
            System.out.print("Строка №" + i + ": ");
            String next = scanner.next();
            if (maxLine.length() < next.length()) {
                maxLine = next;
            } else if (minLine.length() > next.length()) {
                minLine = next;
            }
        }
        System.out.println("Максимальная по длине строка - ".concat(maxLine));
        System.out.print("Минимальная по длине строка - ".concat(minLine));
    }
}
