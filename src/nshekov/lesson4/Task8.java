package nshekov.lesson4;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        System.out.println("Сколько слов вы хотите ввести?");
        Scanner sc = new Scanner(System.in);
        String[] array = new String[sc.nextInt()];
        String[] palindromArrays = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите " + (i + 1) + " слово");
            array[i] = sc.next();
            char[] arrayWord = array[i].toCharArray();
            for (char c : arrayWord) {
                if (c < '0' || c > '9') {
                    array[i] = null;
                    break;
                }
            }
            if (array[i] != null){
                int counter = 0;
                for (int j = 0; j < arrayWord.length / 2; j++) {
                    if (arrayWord[j] != arrayWord[arrayWord.length - j - 1]){
                        break;
                    } else {
                        counter++;
                    }
                    if(counter == arrayWord.length / 2){
                        palindromArrays[i] = array[i];
                    }
                }
            }
        }
        int counter = 0;
        for (String palindromArray : palindromArrays) {
            //System.out.println(palindromArrays[i]);
            if (palindromArray != null) {
                counter++;
                if (counter == 2) {
                    System.out.println(palindromArray.concat(" - второй числовой палиндром"));
                }
            }
        }
    }
}
