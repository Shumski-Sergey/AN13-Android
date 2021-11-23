package nshekov.lesson2;

import java.util.Scanner;

public class Discriminant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ввод:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double discr = dis(a, b, c);
        if (discr > 0){
            double x1 = (-b + Math.sqrt(discr))/(2 * a);
            double x2 = (-b - Math.sqrt(discr))/(2 * a);
            System.out.println("Вывод:\n" + x1 + " " + x2);
        } else if (discr == 0){
            double x = -b*b/(2*a);
            System.out.println("Вывод:\n" + x);
        }
        else {
            System.out.println("Вывод:\nОтрицательный дискриминант");
        }
    }

    static double dis(int a, int b, int c){
        double disc = b*b - 4*a*c;
        return disc;
    }
}
