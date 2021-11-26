package npopov.Lab3;

import java.util.Scanner;

public class Task_2_cycle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = scanner.nextInt();
        boolean bol = true;
        if (a > 1) {
            for (int i = 2; i < a; i++) {
                if (a % i == 0) {
                    bol = false;
                    break;
                }
            }
            if (bol) {
                System.out.println("Число является простым");
            } else {
                System.out.println("Число не является простым");
            }
        } else {
            System.out.println("Ваше число: " + a);
        }
    }
}

