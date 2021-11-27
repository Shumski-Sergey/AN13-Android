package kvitko.Laba3.Practic;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = scanner.nextInt();
        System.out.println(a + "!" + "=" + fact(a));
    }

    public static int fact(int a) {
        if (a <= 0) return 1;
        else return a * fact(a - 1);
    }
}
