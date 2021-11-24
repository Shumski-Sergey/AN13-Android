package npopov.Lab2;

import java.util.Scanner;

public class Task3_dop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = scanner.nextInt();
        if (a > 0) {
            a++;
        } else if (a < 0) {
            a -= 2;
        } else {
            a = 10;
        }

        System.out.println("Полученное число: " + a);
    }
}
