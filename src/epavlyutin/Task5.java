package epavlyutin;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c, sum, sum1;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        sum = 0;
        sum1 = 0;
        if (a % 2 == 0) {
            sum++;
        } else {
            sum1++;
        }
        if (b % 2 == 0) {
            sum++;
        } else {
            sum1++;
        }
        if (c % 2 == 0) {
            sum++;
        } else {
            sum1++;
        }
        if (sum == 1) {
            System.out.println("1 положительное число");
        } else if (sum == 2) {
            System.out.println("2 положительных числа");
        } else if (sum == 3) {
            System.out.println("3 положительных числа");
        } else {
            System.out.println("0 положительных числа");
        }
        if (sum1 == 1) {
            System.out.println("1 отрицательное число");
        } else if (sum1 == 2) {
            System.out.println("2 отрицательных числа");
        } else if (sum1 == 3) {
            System.out.println("3 отрицательных числа");
        } else {
            System.out.println("0 отрицательных числа");


        }
    }
}



