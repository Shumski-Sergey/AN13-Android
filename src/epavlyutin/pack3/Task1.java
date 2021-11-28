package epavlyutin.pack3;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scaner.nextInt();
        int sum = 0;
        while (number != 0) {
            sum = sum + (number % 10);
            number /= 10;


        }
        System.out.println("Сумма чисел указанного числа :" + sum);

    }


}
