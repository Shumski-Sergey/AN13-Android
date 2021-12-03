package lkovsher.Lab4;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        int counter,  counter2 = -1;
        char[] array;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество строк:");
        int numberStr = scanner.nextInt();
        String[] str = new String[numberStr];
        int[] arr = new int[numberStr];
        for(int i = 0; i < numberStr; i++) {
            System.out.print("Введите " + (i + 1) + " строку:");
            str[i] = scanner.next();
            arr[i] = str[i].length();
            array = str[i].toCharArray();
            counter = arr[i];
            for(int j = 0; j < str[i].length(); j++) {
                for(int k = j + 1; k < str[i].length(); k++) {
                    if (array[j] == array[k]) {
                        arr[i]--;
                    }

                }
            }
            if(arr[i] == counter){
                counter2 = i;
            }
            if(counter2 >= 0) {
                System.out.println("Данное слово, состоит только из различных символов: " + str[counter2] + " ");
                counter2 = -1;
            }
        }
    }
}
