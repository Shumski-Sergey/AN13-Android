package nshekov.lesson4;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        System.out.println("Сколько слов вы хотите ввести?");
        Scanner sc = new Scanner(System.in);
        String[] array = new String[sc.nextInt()];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите " + (i + 1) + " слово");
            array[i] = sc.next();
            char[] arrayWord = array[i].toCharArray();
            int counter = 0;
            for (int j = 0; j < arrayWord.length - 1; j++) {
                for (int k = j + 1; k < arrayWord.length; k++) {
                    if (arrayWord[j] == arrayWord[k]){
                        counter++;
                        break;
                    }
                }
                if (counter == 1){
                    break;
                }
            }
            if (counter == 0){
                System.out.println("Это первое слово с различными символами");
                break;
            }
        }
    }
}
