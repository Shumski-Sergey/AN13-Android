package kvitko.Lab4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк: ");
        int n = scanner.nextInt();
        String[] str = new String[n];
        Scanner scanner1 = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Введите строку №" + (i + 1) + ": ");
            str[i] = scanner1.nextLine();
        }

        for (int i = 0; i < n; i++) {
            System.out.print(str[i] + " ");
        }
        System.out.println();

        int min = str[0].length(), max = 0;
        String max_str=new String();

        for (int i = 0; i < n; i++) {
            if(max<str[i].length()) {
                max=str[i].length();
                max_str=str[i];
            }
        }
        System.out.println("Наибольшая строка "+max_str+" с длинной "+max);

        String min_str=new String();

        for (int i = 0; i <n; i++) {
            if(min>str[i].length()) {
                min=str[i].length();
                min_str=str[i];
            }
        }
        System.out.println("Наименьшая строка "+min_str+" с длинной "+min);

    }
}
