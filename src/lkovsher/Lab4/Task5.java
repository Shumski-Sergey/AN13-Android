package lkovsher.Lab4;

import java.util.Scanner;
import java.lang.String;

public class Task5 {
        public static void main(String[] args) {
            int counter = 0, index = 0, counterVowels = 0, counterConsonants = 0, counter2 = 0;
            char[] array;
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите количество строк:");
            int numberStr = scanner.nextInt();
            String[] str = new String[numberStr];
            for(int i = 0; i < numberStr; i++) {
                System.out.print("Введите " + (i + 1) + " строку:");
                str[i] = scanner.next();
                if (str[i].matches("[a-zA-Z]+")) {
                    counter++;
                    index = i;
                    array = str[index].toCharArray();
                    for(int j = 0; j < array.length; j++) {
                        if (array[j] == 'a' || array[j] == 'e' || array[j] == 'i' || array[j] == 'o' || array[j] == 'u' || array[j] == 'y') {
                            counterVowels++;
                        } else counterConsonants++;
                    }
                    if (counterVowels != counterConsonants) {
                        counter2++;
                    }
                }

            }
           System.out.println("Количество слов только с буквами латинского алфавита: " + counter + ".Среди них с разным числом гласных и согласных: " + counter2);
        }

}
