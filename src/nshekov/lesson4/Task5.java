package nshekov.lesson4;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Сколько слов вы хотите ввести?");
        int counter = sc.nextInt();
        int wordLat = counter;                                              //Предполагаем что изначально все слова состоят из латинских символов
        String[] array = new String[counter];
        for (int i = 0; i < counter; i++) {
            System.out.println("Введите " + (i + 1) + " слово:");
            String word = sc.next().toUpperCase();                          //Переводим всю строку в верхний регистр
            char[] charArray = word.toCharArray();                          //Преобразуем строку в массив символов
            for (char c : charArray) {
                if ((int) c < 65 || (int) c > 90) {                          //Проверяем каждый символ массива, является ли заглавной буквой латинского алфавита
                    array[i] = null;                                        //Как только нашел несоответствие, сразу выходит из цикла, оставляя строку пустой
                    wordLat--;                                              //Минус одна строка. Если зашло в условие --> есть не только латинские символы
                    break;
                } else {
                    array[i] = word;                                        //Если все символы латинские - записываем введенное слово в элемент array[i]
                }
            }
            //System.out.println(array[i]);
        }
        System.out.println("Количество строк состоящих только из букв латинского алфавита: " + wordLat);
        int noWord = 0;
        for (int i = 0; i < counter; i++) {
            int glasn = 0;
            if (array[i] != null){
                char[] charArray = array[i].toCharArray();
                for (int j = 0; j < array[i].length(); j++) {
                    if (charArray[j] == 'A' || charArray[j] == 'E' || charArray[j] == 'I' ||
                        charArray[j] == 'O' || charArray[j] == 'U' || charArray[j] == 'Y'){
                        glasn++;
                    } else {
                        glasn--;
                    }
                }
                if (glasn == 0){
                    System.out.println("В строке " + array[i] + " равное количество гласных и согласных");
                    noWord++;
                }
            }
        }
        if (noWord == 0){
            System.out.println("Нет строк с одинаковым количеством гласных и согласных");
        }
    }
}
