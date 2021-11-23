package lkovsher.Lab2;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = scanner.nextInt();
        System.out.println("Введите число:");
        int b = scanner.nextInt();
        if(a<b) {
            System.out.println(b);
        } else if(a>b) {
            System.out.println(a);
        } else System.out.println("Числа равны.");
    }
}
