package kvitko.Lab4;

import java.util.Scanner;

public class Task6 {
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
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] < arr[j + 1])
                    count++;
                else break;
            }
            if (count == arr.length - 1) {
                System.out.println("Слово в котором символы идут по увеличению их номеров: " + str[i]);
                break;
            }
        }
    }
}

