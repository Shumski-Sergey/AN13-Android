package kvitko.Lab4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int n = scanner.nextInt();
        String[] str = new String[n];
        int[] sum = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Введите строку №" + (i + 1) + ": ");
            str[i] = scanner.next();
            sum[i] = str[i].length();
            char[] st = str[i].toCharArray();
            for (int j = 0; j < str[i].length(); j++) {
                for (int m = j + 1; m < str[i].length(); m++) {
                    if (st[j] == st[m]) {
                        sum[i] -= 1;
                        break;
                    }
                }
            }
            System.out.println("Количество различных символов: " + sum[i]);
        }
        int min = sum[0], minchar = 0;
        ;

        for (int i = 1; i < sum.length; i++) {
            if (sum[i] < min) {
                min = sum[i];
                minchar = i;
            }
        }
        System.out.println("В слове " + str[minchar] + " минимальное количество различных символов: " + min);
    }
}
