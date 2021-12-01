package epavlyutin.pack4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во строк ");
        int str = scanner.nextInt();
        String[] string = new String[str];
        Scanner scanner1 = new Scanner(System.in);

        for (int i = 0; i < str; i++) {
            System.out.println("Введите строку №" + (i + 1) + ":");
            string[i] = scanner1.nextLine();
        }
        int centr = 0;
        for (int i = 0; i < str; i++){
            centr = string[i].length() + centr;
        }
        centr /= str;
        System.out.println("Средняя длина строки: " + centr);
        System.out.println();
        System.out.print("Строки, длина которых больше средней: ");
        for (int i = 0; i < str; i++){
            if (string[i].length() > centr)
                System.out.println(string[i] + " с количеством строк: " + string[i].length());
            }
        System.out.println();
        System.out.print("Строки, длина которых меньше средней: ");
        for (int i = 0; i < str; i++){
            if (string[i].length() < centr)
                System.out.println(string[i] + " с количеством строк: " + string[i].length());
        }
    }
}
