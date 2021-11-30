package nshekov.lesson2.dopTask;

import java.util.Scanner;

public class Task2Triangle {
    public static void main(String[] args) {
        System.out.println("Enter the sides of the triangle:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if ((a+b < c) || (a+c < b) || (b+c < a)){
            System.out.println("Impossible trianle");
        } else {
            System.out.println("Your triangle is beautiful");
        }
    }
}
