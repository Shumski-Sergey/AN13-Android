package nshekov.lesson2.dopTask2;

import java.util.Scanner;

public class Task2B {
    public static void main(String[] args) {
        System.out.println("Enter your number:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("Positive natural divisors:");
        for (int i = number; i > 0; i--) {
            if (number % i == 0){
                System.out.println(i);
            }
        }
    }
}
