package lkovsher.Lab4;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        StringBuffer buffer = new  StringBuffer();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество строк:");
        int numberStr = scanner.nextInt();
        String[] str = new String[numberStr];
        for (int i = 0; i < numberStr; i++) {
            System.out.print("Введите " + (i + 1) + " строку:");
            str[i] = scanner.next();
        }
        System.out.print("Слова палиндромы, состоящие только из цифр: ");
        for (int i = 0; i < numberStr; i++) {
            if (str[i].matches("[0-9]+")) {
                buffer.append(str[i]).reverse();
                if (buffer.toString().equals(str[i])) {
                    System.out.print(str[i] + "; ");
                    buffer.delete(0, buffer.length());
                }
            }
        }
    }
}
