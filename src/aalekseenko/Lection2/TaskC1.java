package aalekseenko.Lection2;

import java.util.Scanner;

public class TaskC1 {
    private static double ConvertCelsiumToFahrenheit(int TC) {
        return (TC*9/5 + 32);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double TF = ConvertCelsiumToFahrenheit(sc.nextInt());
        System.out.println(TF);
    }
}
