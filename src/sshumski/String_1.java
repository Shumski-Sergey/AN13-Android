package sshumski;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class String_1 extends Object {
    private static final SimpleDateFormat FORMAT_RU_DATE = new SimpleDateFormat("dd-MMMM-yyyy", new Locale("RU"));

    /**
     * 1. Ввести n строк с консоли, найти самую короткую и
     * самую длинную строки.
     * Вывести найденные строки и их длину.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество строк: ");
        Integer countStr = sc.nextInt();
        System.out.println("Строка №1: ");
        String maxLine = sc.next();
        String minLine = maxLine;
        for (int i = 1; i < countStr; i++) {
            System.out.println("Строка" + "№" + i + ": ");
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
