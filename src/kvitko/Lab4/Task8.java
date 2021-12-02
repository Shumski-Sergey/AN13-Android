package kvitko.Lab4;

import java.util.Scanner;

public class Task8 {
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
        int count = 0;
        for (int i = 0; i < n; i++) {
            arr = str[i].toCharArray();
            if (arr[i] == '0' || arr[i] == '1' || arr[i] == '2' || arr[i] == '3' || arr[i] == '4' || arr[i] == '5' ||
                    arr[i] == '6' || arr[i] == '7' || arr[i] == '8' || arr[i] == '9') {
                if (arr[i] % 2 == 0) {
                    for (int j = 0; j < arr.length / 2 - 1; j++) {
                        if (arr[j] != arr[arr.length - j - 1]) break;
                        else count++;
                    }
                } else {
                    for (int k = 0; k < (arr.length - 1) / 2 - 1; k++) {
                        if (arr[k] != arr[arr.length - k - 1]) break;
                        else count++;
                    }
                }
                if (count == 2) System.out.println("Второй числовой палиндром: " + str[i]);
            }

        }
    }
}
