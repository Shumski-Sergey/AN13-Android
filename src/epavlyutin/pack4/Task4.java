package epavlyutin.pack4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во строк ");
        int str = scanner.nextInt();
        String[] string = new String[str];
        int[] sum = new int[str];
        Scanner scanner1 = new Scanner(System.in);

        for (int i = 0; i < str; i++) {
            System.out.println("Введите строку №" + (i + 1) + ":");
            string[i] = scanner1.next();
            sum[i] = string[i].length();
            char[] array = string[i].toCharArray();
            for (int j = 0; j < string[i].length(); j++) {
                for (int a = j + 1; a < string[i].length(); a++) {
                    if (array[j] == array[a]) {
                        sum[i] -= 1;
                        break;
                    }
                }
            }
        }
        int min = sum[0];
        int min2 = 0;
        for (int i = 1; i < sum.length; i++) {
            if (sum[i] < min) {
                min = sum[i];
                min2 = i;
                System.out.println("минимальное количество различных символов в слове " + string[min2] + "\n" + min + " символов");
            }
        }
    }
}
