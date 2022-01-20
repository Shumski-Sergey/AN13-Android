package ibagritsevich.lection_2;

import java.util.Scanner;

public class TaskB2 {

    public static void main(String[] args) {

        System.out.println("Ввод:");
        Scanner scanner = new Scanner(System.in);
        double x1;
        double x2;
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(Dis(a, b, c));

        if (Dis(a, b, c) > 0) {
            x1 = (-b + Math.sqrt(Dis(a, b, c))) / (2 * a);
            x2 = (-b - Math.sqrt(Dis(a, b, c))) / (2 * a);
            System.out.println(x1 + " " + x2);
        } else if (Dis(a, b, c) == 0) {
            x1 = (-b + Math.sqrt(Dis(a, b, c))) / (2 * a);
            System.out.println(x1);
        } else {
            System.out.println("Отрицательный дискриминант");
        }
    }

    public static double Dis(int a, int b, int c) {

        double D;
        D = b * b - 4 * a * c;
        return D;
    }
}