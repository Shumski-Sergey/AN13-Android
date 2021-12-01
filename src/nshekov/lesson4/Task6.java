package nshekov.lesson4;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Сколько слов вы хотите ввести?");
        int words = sc.nextInt();
        String[] array = new String[words];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите " + (i + 1) + " слово");
            array[i] = sc.next();
            char[] arrayWord = array[i].toCharArray();
            int counter = 1;
            for (int j = 0; j < arrayWord.length - 1; j++) {
                if (arrayWord[j] < arrayWord[j+1]) {
                    counter++;
                } else break;
            }
            if (counter == arrayWord.length){
                System.out.println("Это первое слово в котором символы идут по возрастанию их кодов");
                break;
            }
        }
    }
}
