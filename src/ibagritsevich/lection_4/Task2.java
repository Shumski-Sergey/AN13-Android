package ibagritsevich.lection_4;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите n строк: ");
        int num = scanner.nextInt();
        String[] str = new String[num];
        for (int i = 0; i < num; i++) {
            System.out.println("Введите " + (i + 1) + " строку");
            str[i] = scanner.next();
        }
        System.out.println("Строки в порядке возрастания длины: ");
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num - 1; j++) {
                if (str[j].length() > str[j + 1].length()) {
                    String temp = str[j];
                    str[j] = str[j + 1];
                    str[j + 1] = temp;
                }
            }
        }
        for (String a : str) {
            System.out.println(a);
        }
        System.out.println();
        System.out.println("Строки в порядке убывания длины: ");
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num - 1; j++) {
                if (str[j].length() < str[j + 1].length()) {
                    String temp = str[j];
                    str[j] = str[j + 1];
                    str[j + 1] = temp;
                }
            }
        }
        for (String a : str) {
            System.out.println(a);
        }
    }
}
