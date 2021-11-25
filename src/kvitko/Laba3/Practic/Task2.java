package kvitko.Laba3.Practic;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        int a = number;
        if (number<=1)
        while (number % a == 0 && a > 1){
            a--;
        }
        if(a!=1) System.out.println("Составное");
        else System.out.println("Простое");
    }
}