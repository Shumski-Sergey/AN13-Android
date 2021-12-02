package mshpudeyko.Practice3.String;

import java.util.Objects;
import java.util.Scanner;
import java.lang.String;

/*
* Ввести n слов с консоли. Найти слово, в котором число различных символов минимально.
* Если таких слов несколько, найти первое из них.
* */
public class Tsk4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of strings: ");
        int number = scanner.nextInt();
        String[] strings = new String[number];
        int min=0;
        for (int i = 0; i < number; i++) {
            System.out.print("Enter string № " + (i + 1) + " : ");
            strings[i] = scanner.next();
            if(min<strings[i].length()) {
                min = strings[i].length();
            }
        }
        int temp = 0,i=0;
        for (; i < number; i++) {
            int count = 0;
            for (int j = 0; j < strings[i].length() - 1; j++) {
                for (int k = j; k < strings[i].length() - 1; k++) {
                    if ((int) strings[i].charAt(j) == (int) strings[i].charAt(k + 1)) {
                        count++;
                    }
                }
            }
            if (count<min) {
                min = count;
                temp = i;
            }
        }
        System.out.print("Word in which the number of different symbols is minimal: "+strings[temp]);
    }
}
