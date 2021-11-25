package epavlyutin;

import java.util.Scanner;

public class workB1 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int a,b,c;
        double x1,x2,dis;
        System.out.println("Введите число a: ");
        a = scaner.nextInt();
        System.out.println("Введите число b: ");
        b = scaner.nextInt();
        System.out.println("Введите число c: ");
        c = scaner.nextInt();
        dis = (double) b * (double) b - 4 * (double) a * (double) c;
        if (dis == 0) {
            x1 = (double)-b / (2 * (double)a);
            System.out.println("X1 = " + x1);
        } else if (dis > 0){
                x1 = ((double)-b + Math.sqrt(dis))/(2 * (double)a);
                x2 = ((double)-b - Math.sqrt(dis))/(2 * (double)a);
                System.out.println("X1 = " + x1 + " " + "X2 = " + x2);
            } else {
            System.out.println("Отрицательный дискриминант");
        }





    }
}
