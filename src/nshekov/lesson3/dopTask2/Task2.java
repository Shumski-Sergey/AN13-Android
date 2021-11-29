package nshekov.lesson3.dopTask2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Enter your number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int j = 0;
        for (int i = 1; i <= number; i++) {
            int ost = number % i;
            if (ost == 0){
                j++;
            }
        }
        if (j == 2){
            System.out.println("Your number is simple");
        } else {
            System.out.println("Yoyr number is not simple");
        }
    }
}
