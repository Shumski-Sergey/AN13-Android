package nshekov.lesson4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Сколько строк вы хотите ввести?");
        int counter = sc.nextInt();
        String line;
        System.out.println("Первая строка:");
        String minLine = sc.next();
        String maxLine = minLine;
        for (int i = 1; i < counter; i++) {
            System.out.println("Введите " + (i + 1) + " строку");
            line = sc.next();
            if (line.length() > maxLine.length()){
                maxLine = line;
            } else if (line.length() < minLine.length()){
                minLine = line;
            }
        }
        System.out.println(minLine.concat(" - самая короткая строка. Её длина " + minLine.length() + " символа(ов)"));
        System.out.println(maxLine.concat(" - самая длинная строка. Её длина " + maxLine.length() + " символа(ов)"));
    }
}
