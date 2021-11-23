package lkovsher.Lab2;

import java.util.Scanner;


public class TaskB2 {

    public static double dis(int a, int b, int c){
        return (b*b - 4*a*c);
    }

    public static void main(String[] args) {
        double x1,x2,d;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число а:");
        int a = scanner.nextInt();
        System.out.print("Введите число b:");
        int b = scanner.nextInt();
        System.out.print("Введите число c:");
        int c = scanner.nextInt();
        d=dis(a,b,c);
        if(d > 0){
            d =Math.sqrt(d);
            x1=(-b+d)/(2*a);
            x2=(-b-d)/(2*a);
            System.out.println("Корни уравнения: " + x1 + " " + x2);
        } else if(d==0) {
            x1=(-b)/(2*a);
            System.out.println("Корень уравнения: " +x1);
        } else {
            System.out.println("Отрицательный дискриминант!");
        }

    }
}
