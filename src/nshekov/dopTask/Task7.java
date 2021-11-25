package nshekov.dopTask;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        System.out.println("Enter the number of programmers:");
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        int len = number.length() - 1;
        char[] str = number.toCharArray();
        int a = Character.digit(str[len], 10);
        int b = 0;
        if (len > 0) {
            b = Character.digit(str[len - 1], 10);
        }
        if (a == 1 && b != 1) {
            System.out.println(number + " программист");
        } else if (a > 1 && a < 5) {
            System.out.println(number + " программиста");
        } else if ((a > 4 && a <= 9) || (b == 1) || (a == 0)) {
            System.out.println(number + " программистов");
        }
    }
}
