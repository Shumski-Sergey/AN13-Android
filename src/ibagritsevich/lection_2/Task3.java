package ibagritsevich.lection_2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input number: ");
        int num = scanner.nextInt();
        if (num > 0) {
            num++;
        } else if (num < 0) {
            num = num - 2;
        } else num = 10;
        System.out.println("Полученное целое число: " + num);
    }
}
