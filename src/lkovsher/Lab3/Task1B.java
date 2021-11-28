package lkovsher.Lab3;

import java.util.Scanner;

public class Task1B {
    public static void main(String[] args) {
        int factorial=1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число:");
        int a = scanner.nextInt();
        for(int i = 1; i <= a; i++ ){
            factorial=factorial*i;
        }
        System.out.println(a + "! = " + factorial);
    }
}
