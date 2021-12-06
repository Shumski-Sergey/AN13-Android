package asemiakin.lab4;

import java.util.ArrayList;
import java.util.Scanner;

public class Task8 {
    private static boolean palindrome(String[] strings, int i){
        for (int j = 0; j < (strings[i].length()/2); j++){
            if (strings[i].charAt(j) != strings[i].charAt(strings[i].length() - j - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество слов: ");
        int countStr = scanner.nextInt();
        ArrayList<String> arrayList = new ArrayList<>();
        String[] strings = new String[countStr];
        for (int i = 0; i < countStr; i++) {
            System.out.print("Слово №" + (i+1) + ": ");
            strings[i] = scanner.next();
        }
        for (int i = 0; i < countStr; i++ ) {
            int count = 0;
            for (int j = 0; j < strings[i].length(); j++){
                if (strings[i].charAt(j) > 48 && strings[i].charAt(j) < 58 ){
                    count++;
                }
            }
            if (count == strings[i].length()) {
                if (palindrome(strings, i)) arrayList.add(strings[i]);
            }
        }
        if (arrayList.size() > 1) System.out.println("Всего слов палиндромов, состоящих только из цифр - " + arrayList.size() + ". Второе из них - " + arrayList.get(1));
        else if (arrayList.size() == 1) System.out.println("Найдено только одно слово палиндром, состоящее только из цифр - " + arrayList.get(0));
        else System.out.println("Слов палиндромов, состоящих только из цифр, не найдено.");
    }
}
