package asemiakin.lab4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int countStr = scanner.nextInt();
        String[] strings = new String[countStr];
        for (int i = 0; i < countStr; i++ ){
            System.out.print("Строка №" + (i+1) + ": ");
            strings[i] = scanner.next();
        }
        Arrays.sort(strings, Comparator.comparing(String::length));
        System.out.println("Строки в порядке возрастания их длины:");
        for (int i = 0; i < countStr; i++ ){
            System.out.println(strings[i]);
        }
        System.out.println("Строки в порядке убывания их длины:");
        for (int i = countStr; i > 0; i-- ){
            System.out.println(strings[i - 1]);
        }
    }
}
