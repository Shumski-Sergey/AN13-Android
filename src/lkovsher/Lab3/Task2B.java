package lkovsher.Lab3;

import java.util.Scanner;

public class Task2B {
    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите натуральное число:");
        if(scanner.hasNextInt()){
            a = scanner.nextInt();
            System.out.print("Делители числа " + a +": ");
            for (int i=1; i <= a; i++) {
                if (a % i == 0) {
                    System.out.print(i + " ");
                }
            }

        } else System.out.println("Число не натуральное!");
    }
}
