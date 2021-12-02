package asemiakin.lab4;

import java.util.Arrays;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество слов: ");
        int countStr = scanner.nextInt();
        String[] strings = new String[countStr];
        for (int i = 0; i < countStr; i++ ) {
            System.out.print("Слово №" + (i + 1) + ": ");
            strings[i] = scanner.next();
        }
        for (int i = 0; i < countStr; i++ ) {
            char[] chArray = strings[i].toCharArray();
            int count = 1;
            Arrays.sort(chArray);
            for (int j = 1; j < strings[i].length(); j++){
                if (chArray[j] != chArray[j-1]){
                    count++;
                }
            }
            if (count == strings[i].length()) {
                System.out.println("Слово, состоящее только из различных символов - " + strings[i]);
                System.exit(0);
            }
        }
        System.out.println("Среди введённых слов нет слова, состоящего только из различных символов.");
    }
}
