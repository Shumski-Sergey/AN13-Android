package kvitko.Lab2;

import java.util.Scanner;

public class Lab2_task_B {


    public static double dis(int a, int b, int c) {
        return b^2+4*a*c;
    }

    public static void main(String[] args) {

        double d, x1,x2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("a*x^2+b*x+c=0");
        System.out.print("Введите число a:");
        int a = scanner.nextInt();
        System.out.print("Введите число b:");
        int b = scanner.nextInt();
        System.out.print("Введите число c:");
        int c = scanner.nextInt();
        System.out.println("a*x^2+b*x+c=0");
        d=dis(a,b,c);
        d=Math.sqrt(d);
        if (d>0){
            x1=(-b-d)/2*a;
            x2=(-b+d)/2*a;
            System.out.println(x1+" "+x2);
        } else if (d==0){
            x1=-b/2*a;
            System.out.println(x1);
        }
        else if(d<0){
            System.out.println("Отрицательный дискриминант");
        }
    }
}