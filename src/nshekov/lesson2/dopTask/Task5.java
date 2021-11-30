package nshekov.lesson2.dopTask;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Enter your three number");
        Scanner sc = new Scanner(System.in);
        int countPositive = 0, countNegative = 0;
        for (int i = 0; i < 3; i++) {
            int number = sc.nextInt();
            if (number > 0) {
                countPositive++;
            } else if (number < 0) {
                countNegative++;
            }
        }
        System.out.println(countPositive + " positive\n" + countNegative + " negative");
    }
}