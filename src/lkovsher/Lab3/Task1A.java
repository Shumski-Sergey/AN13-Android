package lkovsher.Lab3;

import java.util.Scanner;

public class Task1A {
    public static int sumDigitsInNumber(int number){
        int sum=0;
        while(number != 0){
           sum = sum + (number%10);
           number=number/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число:");
        int number = scanner.nextInt();
        System.out.println("Сумма цифр в заданном числе:" + sumDigitsInNumber(number));
    }
}
