package nshekov.dopTask2;

import java.util.Scanner;

public class Task1B {
    public static void main(String[] args) {
        System.out.println("Enter your number:");
        Scanner sc = new Scanner(System.in);
        int fuct = sc.nextInt();
        for (int i = fuct - 1; i > 0 ; i--) {
            fuct *= i;
        }
        System.out.println(fuct);
    }
}
