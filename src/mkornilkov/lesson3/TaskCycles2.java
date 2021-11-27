package mkornilkov.lesson3;

import java.util.Scanner;

public class TaskCycles2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите целое положительное число");
        int a = sc.nextInt();
        if (a == 1){
            System.out.println("Вы ввели число 1, оно не является ни простым, ни составным числом. Попробуйте еще раз");
        }
        if (a > 1){
            int i = a - 1;
            while (i > 1) {
                if (a % i == 0){
                    System.out.println("Данное число является составным");
                    break;
                }
                i--;
            }
            if (i == 1) System.out.println("Данное число является простым");
        }
    }
}
