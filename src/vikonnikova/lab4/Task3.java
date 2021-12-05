package vikonnikova.lab4;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        double average = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество строк: ");
        int countStr = sc.nextInt();

        String[] line = new String[countStr];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < countStr; i++) {
            System.out.println("Введите строку №" + (i + 1));
            line[i] = in.nextLine();
            average += line[i].length();
        }
            average /= countStr;

            System.out.println("Строки меньшие, чем средняя длина: ");
            for (int i = 0; i < countStr; i++) {
                if (line[i].length() < average) {
                    System.out.println(line[i] + " ее длина - " + line[i].length());
                }
            }
            System.out.println("Строки большие, чем средняя длина: ");
            for (int i = 0; i < countStr; i++) {
                if (line[i].length() > average) {
                System.out.println(line[i] + " ее длина - " + line[i].length());
            }
        }
    }
}





