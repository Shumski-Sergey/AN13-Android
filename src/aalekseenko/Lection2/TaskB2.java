package aalekseenko.Lection2;

import java.util.Scanner;

public class TaskB2 {
    private static double dis(int a, int b, int c) {
        return b*b-4*a*c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double D=dis(a,b,c);
        if (D > 0) {
            double x1 = (Math.sqrt(D)-b)/(2*a);
            double x2 = (-Math.sqrt(D)-b)/(2*a);
            System.out.println(""+ x1 + " " + x2);
        }
        else if (D == 0) {
            double x = (-b/(2*a));
            System.out.println(x);
        }
        else if (D<0) {
            System.out.println("Отрицательный дискриминант");
        }
    }

}
