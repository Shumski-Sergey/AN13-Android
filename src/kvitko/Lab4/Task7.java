package kvitko.Lab4;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int n = scanner.nextInt();
        String[] str = new String[n];
        char[] arr;
        Scanner scanner1 = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Введите строку №" + (i + 1) + ": ");
            str[i] = scanner1.nextLine();
        }

        for (int i = 0; i < n; i++) {
            arr = str[i].toCharArray();
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                for (int m = j + 1; m < arr.length; m++) {
                    if (arr[j] == arr[m]) {
                        count++;
                        break;
                    }
                }
                if (count == 1) break;
            }
            if (count == 0) {
                System.out.println("Первое слово с различными символами: " + str[i]);
                break;
            }
        }
    }
}
