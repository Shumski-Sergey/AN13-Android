package aalekseenko.Lection4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {
/*
Ввести n слов с консоли. Найти количество слов, содержащих только символы латинского алфавита,
а среди них – количество слов с равным числом гласных и согласных букв.
 */
    public static void main(String[] args) {
        Integer vowels = 0;
        Integer consonants = 0;
        int countStr = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        if (keyboard.hasNextInt()) {
            countStr = keyboard.nextInt();
        } else {
            System.out.print("Введены некорректные данные!");
        }
        String[] massStr = new String[countStr];
        keyboard.nextLine();
        int sumWordsWithLatinSymbols = 0;
        int sumWordsVowelsEqualsConsonants = 0;
        for (int i = 0; i < countStr; i++) {
            System.out.println("Введите строку "+(i + 1));
            massStr[i] = keyboard.nextLine();
            Pattern patlatWord = Pattern.compile("[a-zA-Z]+");
            Matcher matlatWord = patlatWord.matcher(massStr[i]);
            if (matlatWord.matches()) {
                sumWordsWithLatinSymbols++;
                vowels = 0;
                consonants = 0;
                for (int j = 0; j < massStr[i].length(); j++) {

                    char letter = massStr[i].charAt(j);
                    if (letter == 'a' || letter == 'e' ||
                            letter == 'i' || letter == 'o' ||
                            letter == 'u')
                    {
                        vowels++;
                    }
                    else
                    {
                        consonants++;

                    }
                }
                if (vowels.intValue() == consonants.intValue()) {
                    sumWordsVowelsEqualsConsonants++;
                }

            }
        }
        System.out.println("Количество слов с символами только латинского алфавита " + sumWordsWithLatinSymbols);
        System.out.println("Количество слов с равным числом гласных и согласных букв " + sumWordsVowelsEqualsConsonants);
    }
}
