package mkornilkov.lesson3;

import java.util.Scanner;

public class taskCycles1v2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите число");
        int a = sc.nextInt();
        int sum = 0;
        while (a != 0){
            sum = sum + a % 10;
            a = a / 10;
        }
        System.out.println("Сумма цифр заданного числа = "+sum);
    }
}
