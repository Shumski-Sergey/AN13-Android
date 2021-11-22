package epavlyutin;

import java.util.Scanner;

public class work1 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Введите число");

        int a = scaner.nextInt();
        System.out.println("Введите число 2");
        int b = scaner.nextInt();
        System.out.println("Вы ввели:" + a + " " + b);
        System.out.println((a + b) + " " + (a - b) + " " + (a * b) + " " + (a / b) + " " + (a % b));
        System.out.println(((double)(a + b))+ " " + ((double)(a - b))+ " " + ((double)(a * b)) + " " +((double)(a / b)) + " " + ((double)(a % b)));


    }
}
