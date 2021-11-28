package vikonnikova.lab3;

import java.util.Scanner;

public class lab3ATask1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int sum = 0;
        for (int number = sc.nextInt(); number > 0; number /= 10) {
            sum += (number % 10);
        }
        System.out.println(sum);
    }
    }

