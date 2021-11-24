package vikonnikova.lab2BTask2;

import java.util.Scanner;

public class lab2BTask2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        double a, b, c;
        double dis;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        dis = b * b - 4 * a * c;
        if (dis > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(dis)) / (2 * a);
            x2 = (-b + Math.sqrt(dis)) / (2 * a);
            System.out.println(x1 + x2);
        }
        else if (dis == 0) {
                double x;
                x = -b / (2 * a);
            System.out.println(x);
    }
            else {
            System.out.println("Отрицательный дискриминант");
        }


    }
}
