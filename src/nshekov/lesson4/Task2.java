package nshekov.lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Сколько строк вы хотите ввести?");
        int counter = sc.nextInt();
        String[] array = new String[counter];
        System.out.println("Введите 1 строку:");
        array[0] = sc.next();
        for (int i = 1; i < counter; i++) {
            System.out.println("Введите " + (i + 1) + " строку");
            array[i] = sc.next();
        }
        System.out.println("Строки в порядке возрастания их длины");
        for (int i = 0; i < counter; i++) {
            for (int j = 0; j < counter - 1; j++) {
                if (array[j].length() > array[j+1].length()){
                    String tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
        for (String a : array){
            System.out.println(a);
        }
        System.out.println();
        System.out.println("Строки в порядке убывания их длины");
        for (int i = 0; i < counter; i++) {
            for (int j = 0; j < counter - 1; j++) {
                if (array[j+1].length() > array[j].length()){
                    String tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
        for (String a : array){
            System.out.println(a);
        }
    }
}
