package ibagritsevich.lection_3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        System.out.printf("%,d", number); // %,d - вывод целого числа с разделением тысяч
    }
}
