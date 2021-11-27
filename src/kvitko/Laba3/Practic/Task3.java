package kvitko.Laba3.Practic;

import java.text.NumberFormat;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = scanner.nextInt();
        NumberFormat f= NumberFormat.getInstance();
        System.out.println("Ваше число в бухгалтерском формате:"+ f.format(n));
    }
}

