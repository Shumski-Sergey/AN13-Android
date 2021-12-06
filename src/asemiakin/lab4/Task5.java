package asemiakin.lab4;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество слов: ");
        int countStr = scanner.nextInt();
        int resultCountStr = 0;
        String[] strings = new String[countStr];
        for (int i = 0; i < countStr; i++) {
            System.out.print("Слово №" + (i+1) + ": ");
            strings[i] = scanner.next();
        }
        for (int i = 0; i < countStr; i++ ) {
            int count = 0;
            for (int j = 0; j < strings[i].length(); j++){
                char c = Character.toUpperCase(strings[i].charAt(j));
                if (c > 64 && c < 91 ){
                    count++;
                }
            }
            if (count == strings[i].length() && strings[i].length() % 2 == 0) {
                int vowelCount = 0;
                for (int j = 0; j < strings[i].length(); j++){
                    char c = Character.toUpperCase(strings[i].charAt(j));
                    if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'Y'){
                        vowelCount++;
                    }
                }
            if (strings[i].length() - vowelCount == vowelCount) resultCountStr++;
            }
        }
        System.out.println("Количество слов, содержащих только символы латинского алфавита и равным числом гласных и согласных букв - " + resultCountStr);
    }
}
