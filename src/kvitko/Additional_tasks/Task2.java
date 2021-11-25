package kvitko.Additional_tasks;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите a: ");
        int a= scanner.nextInt();
        System.out.println("Введите b: ");
        int b= scanner.nextInt();
        System.out.println("Введите c: ");
        int c= scanner.nextInt();

        if(a<b+c && b<a+c && c<a+b){
            System.out.println("Такой треугольник существует");
        } else System.out.println("Такой треугольник не существует");
    }
}
