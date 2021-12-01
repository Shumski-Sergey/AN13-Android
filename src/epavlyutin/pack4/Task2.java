package epavlyutin.pack4;

import java.util.Scanner;
import java.util.logging.SocketHandler;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во строк ");
        int str = scanner.nextInt();
        String[] string = new String[str];
        Scanner scanner1 = new Scanner(System.in);

        for (int i = 0; i < str; i++) {
            System.out.println("Введите строку №" + (i + 1) + ":");
            string[i] = scanner1.nextLine();
        }
        String tmp;
        for (int i = 1; i < str; i++)
            for (int j = str - 1; j >= i; j--) {
                if (string[j - 1].length() > string[j].length()) {
                    tmp = string[j - 1];
                    string[j - 1] = string[j];
                    string[j] = tmp;
                }
            }
        System.out.println("Вывод строк по возрастанию");
        for (int i = 0; i < str; i++) {
            System.out.println(string[i]);
        }
        System.out.println();
        String tmp1;
        for (int i = 1; i < str; i++)
            for (int j = str - 1; j >= i; j--) {
                if (string[j - 1].length() < string[j].length()) {
                    tmp1 = string[j - 1];
                    string[j - 1] = string[j];
                    string[j] = tmp1;
                }
            }
        System.out.println("Вывод строк по убыванию");
        for (int i = 0; i < str; i++) {
            System.out.println(string[i]);
        }
    }
}
