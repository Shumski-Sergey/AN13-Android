package epavlyutin;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b;
        a = scanner.nextInt();
        System.out.println("Введите переменную а: ");
        b = scanner.nextInt();
        System.out.println("Введите переменную b: ");
        if (a > b){
            System.out.println("Переменная а больше чем b");
        }else{
            System.out.println("Переменная b больше чем а");
        }
    }

}
