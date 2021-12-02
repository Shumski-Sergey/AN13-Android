package asemiakin.lab4;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество слов: ");
        int countStr = scanner.nextInt();
        String[] strings = new String[countStr];
        System.out.println();
        for (int i = 0; i < countStr; i++ ) {
            System.out.print("Слово №" + (i + 1) + ": ");
            strings[i] = scanner.next();
        }
        for (int i = 0; i < countStr; i++ ) {
            int count = 1;
            for (int j = 1; j < strings[i].length(); j++){
                if (strings[i].charAt(j-1) < strings[i].charAt(j)){
                    count++;
                }
            }
            if (count == strings[i].length()) {
                System.out.println("Первое слово, символы в котором идут в строгом порядке возрастания их кодов - " + strings[i]);
                System.exit(0);
            }
        }
        System.out.println("Среди введённых слов нет слова, символы в котором идут в строгом порядке возрастания их кодов.");
    }
}
