package nshekov.lesson4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Сколько слов вы хотите ввести?");
        int counter = sc.nextInt();
        String[] arrayString = new String[counter];
        int[] sum = new int[counter];
        for (int i = 0; i < counter; i++) {
            System.out.println("Введите слово №" + (i + 1));
            arrayString[i] = sc.next();
            sum[i] = arrayString[i].length();
            char[] array = arrayString[i].toCharArray();
            for (int j = 0; j < arrayString[i].length(); j++) {
                for (int k = j + 1; k < arrayString[i].length(); k++) {
                    if (array[j] == array[k]){
                        sum[i] -= 1;
                        break;
                    }
                }
            }
            System.out.println("Количество различных символов: " +sum[i]);
        }
        int min = sum[0];
        int indMin = 0;
        for (int i = 1; i < sum.length; i++) {
            if (sum[i] < min) {
                min = sum[i];
                indMin = i;
            }
        }
        System.out.println("В слове " + arrayString[indMin] + " минимальное количество различных символов: " + min);
    }
}
