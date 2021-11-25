package nshekov.dopTask;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Enter your number:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number > 0){
            number += 1;
        } else if (number < 0){
            number -=2;
        } else {
            number = 10;
        }
        System.out.println(number);
    }
}
