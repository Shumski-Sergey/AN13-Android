package nshekov.lesson4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Сколько строк вы хотите ввести?");
        int counter = sc.nextInt();
        String[] array = new String[counter];
        double arrayLength = 0;
        for (int i = 0; i < counter; i++) {
            System.out.println("Введите " + (i + 1) + " строку:");
            array[i] = sc.next();
            arrayLength += array[i].length();
        }
        arrayLength /= counter;
        System.out.println("Средняя длина строки " + arrayLength + " символов\n");
        System.out.println("Строки с длиной меньше средней:");
        for (int i = 0; i < counter; i++) {
            if (array[i].length() < arrayLength){
                System.out.println(array[i] + "\t количество символов в строке " + array[i].length());
            }
        }
        System.out.println();
        System.out.println("Строки с длиной больше средней:");
        for (int i = 0; i < counter; i++) {
            if (array[i].length() > arrayLength){
                System.out.println(array[i] + "\t количество символов в строке " + array[i].length());
            }
        }
    }
}
