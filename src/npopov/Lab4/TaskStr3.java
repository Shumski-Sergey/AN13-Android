package npopov.Lab4;

import java.util.Scanner;

public class TaskStr3 {

    public static double stringsAverage(String[] str, int n) {
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += str[i].length();

        }
        return sum / n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк: ");
        int n = scanner.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Введите строку: ");
            str[i] = scanner.next();
            System.out.print("");
        }
        System.out.println("CА: "+ stringsAverage(str, n));
        for (int i = 0; i < n; i++) {
            if(str[i].length() < stringsAverage(str, n)) {
                System.out.println(str[i]);
            }
        }
    }
}
