package lkovsher.Lab2;

import java.util.Scanner;

public class TaskC2 {

    public static int sumDigitsInNumber(int number){
        int sum;
        sum=number/1000;
        number=number%1000;
        sum=sum+number/100;
        number=number%100;
        sum=sum+number/10+number%10;
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите четырехзначное число:");
        int number = scanner.nextInt();
        if(number/1000 > 9 ){
            System.out.println("Неправильный ввод!");
        } else {
            System.out.println("Сумма цифр в заданном числе:" + sumDigitsInNumber(number));
        }

    }
}
