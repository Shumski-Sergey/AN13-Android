package mshpudeyko.Practice3.String;

import java.util.Scanner;

/*
 *  Ввести n слов с консоли. Найти количество слов, содержащих только символы латинского алфавита,
 *  а среди них – количество слов с равным числом гласных и согласных букв.
 * */
public class Tsk5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of words: ");
        int number = scanner.nextInt();
        String[] strings = new String[number];
        int count = 0, temp=0;
        for (int i = 0; i < number; i++) {
            System.out.print("Enter word № " + (i + 1) + " : ");
            strings[i] = scanner.next();
            if (strings[i].matches("[a-zA-Z]+")) {
                int vowels = 0, consonants = 0;
                count++;
                for (int j = 0; j < strings[i].length(); j++) {
                    if (    strings[i].charAt(j) == 'A' || strings[i].charAt(j) == 'E' || strings[i].charAt(j) == 'I' ||
                            strings[i].charAt(j) == 'O' || strings[i].charAt(j) == 'U' || strings[i].charAt(j) == 'Y' ||
                            strings[i].charAt(j) == 'a' || strings[i].charAt(j) == 'e' || strings[i].charAt(j) == 'i' ||
                            strings[i].charAt(j) == 'o' || strings[i].charAt(j) == 'u' || strings[i].charAt(j) == 'y') {
                        vowels++;
                    }
                    else consonants++;
                }
                if(vowels==consonants)temp++;
            }
        }
        System.out.println("Number of words consists only of Latin symbols: "+count);
        System.out.println("Number of words where the number of vowel letters is equal to the number of consonants: "+temp);
    }
}
