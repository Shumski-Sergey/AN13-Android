package npopov.Lab2;

import java.util.Scanner;

public class Task7_dop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество программистов: ");
        int a = scanner.nextInt();
        if (a % 10 == 2 || a % 10 == 4 || a % 10 == 4) {
            System.out.println(a + " программиста");
        } else if (a % 10 == 1) {
            System.out.println(a + " программист");
        } else {
            System.out.println(a + " программистов");
        }
    }
}
