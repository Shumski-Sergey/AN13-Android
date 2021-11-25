package epavlyutin;

import java.util.Scanner;

public class Task4a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,c,sum;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        sum = 0;
        if (a % 2 == 0) {
            sum++;
        }else {
            sum = sum;
        }
        if (b % 2 == 0) {
            sum++;
        }else {
            sum = sum;
        }
        if (c % 2 == 0) {
            sum++;
        }else {
            sum = sum;
        }
        if(sum == 1){
            System.out.println("1 положительное число");
        }else if (sum == 2){
            System.out.println("2 положительных числа");
        }else {
            System.out.println("3 положительных числа");
        }


    }
}


