package npopov.Lab4;

import java.util.Arrays;
import java.util.Scanner;

public class TaskStr2 {
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
        Arrays.sort(str);
        for (int i = 0; i < n; i++) {
            System.out.println(str[i]);
        }
        for (int j = n - 1; j >= 0; j--) {
            System.out.println(str[j]);
        }
    }
}
