package vikonnikova.lab4;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество строк: ");
        int countStr = sc.nextInt();

        String[] line = new String[countStr];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < countStr; i++) {
            System.out.println("Введите строку №" + (i+1));
            line[i] = in.nextLine();
        }
        for (int i = 0; i < countStr; i++) {
            for (int j = 0; j < countStr - 1; j++) {
                // по возрастанию меняем знак на >
                if (line[j].length() > line[j + 1].length()) {
                    String tmp = line[j];
                    line[j] = line[j + 1];
                    line[j + 1] = tmp;
                }
            }
        }
        for (String a : line)
        System.out.println(a);
          }
}




