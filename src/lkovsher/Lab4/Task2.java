package lkovsher.Lab4;


import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество строк:");
        int numberStr = scanner.nextInt();
        String[] str = new String[numberStr];
        String temp;
        for(int i = 0; i < numberStr; i++){
            System.out.print("Введите " + (i + 1) + " строку:");
            str[i] = scanner.next();
        }

        for(int i = 1; i < str.length ; i++)
        {
            for(int j = 0; j < i; j++){
                if (str[j].length() > str[j+1].length()) {
                    temp = str[j];
                    str[j] = str[j+1];
                    str[j+1] = temp;
                }
            }
        }
        System.out.println("В порядке возрастания:");
        for(int i = 0; i < numberStr; i++){
            System.out.println(str[i]);
        }
    }

}
