package lkovsher.Lab4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество строк:");
        int numberStr = scanner.nextInt();
        double number = 0;
        String[] str = new String[numberStr];

        for(int i = 0; i < numberStr; i++){
            System.out.print("Введите " + (i + 1) + " строку:");
            str[i] = scanner.next();
            number = number + str[i].length();
        }
        System.out.println("Строки, по длине меньшие среднего арифметического длины всех строк: ");
        for(int i = 0; i < numberStr; i++){
            if(str[i].length() < (number/numberStr)){
                System.out.println( "Строка " + (i + 1) + ": " + str[i] + " (Длина " + str[i].length() + ")");
            }
        }
    }
}
