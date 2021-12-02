package lkovsher.Lab4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int minNumber = 0; int index = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество строк:");
        int numberStr = scanner.nextInt();
       // StringBuffer st = new StringBuffer();
        String[] str = new String[numberStr];
        int[] arr = new int[numberStr];
        char[] array;
        for(int i = 0; i < numberStr; i++){
            System.out.print("Введите " + (i + 1) + " строку:");
            str[i] = scanner.next();
            arr[i] = str[i].length();
            //st.append(str[i] + " ");
            array = str[i].toCharArray();
            for(int j = 0; j < str[i].length(); j++){
                for(int k = j + 1; k < str[i].length(); k++) {
                    if (array[j] == array[k]) {
                        arr[i]--;
                        break;
                    }
                }
            }
        }
        minNumber = arr[0];
        for(int i = 0; i < numberStr; i++){
            if(arr[i] < minNumber){
                minNumber = arr[i];
                index = i;
            }
        }
        System.out.println("Минимальное число различных символов в слове " + (index + 1) + ": " + str[index] );
    }
}
