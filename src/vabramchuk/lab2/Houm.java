package vabramchuk.lab2;

import java.util.Scanner;
public class Houm {

    public static void main(String[] args) {
	// write your code here
      //  int a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи значение а:");
        int a = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введи значение b:");
        int b = scanner.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введи значение с:");
        int c = scanner.nextInt();
        double D;
        D = b * b - 4 * a * c;
        if (D > 0) { double x1, x2;
            x1 = (-b - Math.sqrt(D))/(2 * a);
            x2 = (-b + Math.sqrt(D))/(2 * a);
            System.out.println("Корни уравнения: х1 = " + x1 +" ,x2 = " + x2);}
            else if (D == 0) {
                double x;
                x = -b / (2 * a);
                System.out.println("Уравнение имеет единственный корень: х = " + x);}
            else { System.out.println("Уравнение не имеет действительных корней");
        }

    }
}
