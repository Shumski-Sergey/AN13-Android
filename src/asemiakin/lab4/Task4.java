package asemiakin.lab4;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество слов: ");
        int countStr = scanner.nextInt();
        String[] strings = new String[countStr];
        int[] numbersOfDifferentChars = new int[countStr];
        for (int i = 0; i < countStr; i++ ) {
            System.out.print("Слово №" + (i + 1) + ": ");
            strings[i] = scanner.next();
            int countOfDifferentChars = 1;
            char[] chArray = strings[i].toCharArray();
            Arrays.sort(chArray);
            for (int j = 1; j < strings[i].length(); j++){
                if (chArray[j] != chArray[j-1]) countOfDifferentChars++;
            }
            numbersOfDifferentChars[i] = countOfDifferentChars;
        }
        int minNum = numbersOfDifferentChars[0];
        int indexOfString = 0;
        for (int i = 1; i < numbersOfDifferentChars.length; i++){
            if (numbersOfDifferentChars[i] < minNum) {
                minNum = numbersOfDifferentChars[i];
                indexOfString = i;
            }
        }
        System.out.println("Слово, в котором число различных символов минимально - " + strings[indexOfString]);
    }
}
