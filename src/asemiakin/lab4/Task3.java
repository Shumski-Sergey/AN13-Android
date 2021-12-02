package asemiakin.lab4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int countStr = scanner.nextInt();
        int sumStr = 0, averageStr;
        String[] strings = new String[countStr];
        for (int i = 0; i < countStr; i++) {
            System.out.print("Строка №" + (i+1) + ": ");
            strings[i] = scanner.next();
            sumStr += strings[i].length();
        }
        averageStr = sumStr / countStr;
        System.out.println("Средняя длина введёных строк = " + averageStr);
        System.out.println("Строки с длиной меньше, чем средняя длина введёных строк:");
        for (int i = 0; i < countStr; i++) {
            if (strings[i].length() < averageStr){
                System.out.println(strings[i] + ", длина данной строки = " + strings[i].length());
            }
        }
        System.out.println("Строки с длиной больше, чем средняя длина введёных строк:");
        for (int i = 0; i < countStr; i++) {
            if (strings[i].length() > averageStr){
                System.out.println(strings[i] + ", длина данной строки = " + strings[i].length());
            }
        }
    }
}
