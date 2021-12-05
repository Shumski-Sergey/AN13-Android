package aalekseenko.Lection4;

import java.util.Scanner;

public class Task4 {
/*
Ввести n слов с консоли. Найти слово, в котором число различных символов минимально.
Если таких слов несколько, найти первое из них.
 */
public static void main(String[] args) {
    int countStr = 0;
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Введите количество строк: ");
    if (keyboard.hasNextInt()) {
        countStr = keyboard.nextInt();
    } else {
        System.out.print("Введены некорректные данные!");
    }
    String[] massStr = new String[countStr];
    int[] countDifferentSymbols = new int[countStr];
    int j = 0;
    keyboard.nextLine();
    for (int i = 0; i < countStr; i++) {
        System.out.println("Введите строку "+(i + 1));
        massStr[i] = keyboard.nextLine();
        countDifferentSymbols[j] = (int) massStr[i].chars().distinct().count();
        j++;
    }
    int minDifferentSymbols = countDifferentSymbols[0];
    int temp = 0;
    for (int i = 1; i < countStr; i++) {
        if (countDifferentSymbols[i]<minDifferentSymbols){
            minDifferentSymbols = countDifferentSymbols[i];
            temp = i;
        }
    }
System.out.println("Слово с минимальным числом различных символов " + massStr[temp]);
}
}
