package ibagritsevich.lection_4;

import java.util.Scanner;

public class Task4 {

    public static int DiffWords(String str) {
        StringBuilder diffStr = new StringBuilder();
        String symbol;
        for (int i = 0; i < str.length(); i++) {
            symbol = String.valueOf((str.charAt(i)));
            if (diffStr.indexOf(symbol) == -1) {
                diffStr.append(symbol);
            }
        }
        return diffStr.length();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите n строк: ");
        int num = scanner.nextInt();
        String[] str = new String[num];
        for (int i = 0; i < num; i++) {
            System.out.println("Введите " + (i + 1) + " строку");
            str[i] = scanner.next();
        }

        String word = str[0];

            for (int i = 0; i < num; i++) {
                System.out.print("Слово: " + str[i] + "\t");
                if (DiffWords(str[i]) < DiffWords(word)) {
                    word = str[i];
                }
                else str[i] = word;
                System.out.println("\tИскомое слово: " + word + ", число разных символов: " + DiffWords(word) + "\n");
            }
        }
    }