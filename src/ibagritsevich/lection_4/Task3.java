package ibagritsevich.lection_4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        double sum = 0;
        double avr;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите n строк: ");
        int num = scanner.nextInt();
        String[] str = new String[num];
        for (int i = 0; i < num; i++) {
            System.out.println("Введите " + (i + 1) + " строку");
            str[i] = scanner.next();
        }
        System.out.println("Нахождение длины каждой строки:");
        for (int i = 0; i < num; i++){
            System.out.println(str[i].length());
            sum += str[i].length();
        }
        avr = sum/num;
        System.out.println("Средняя длина строки: =" + "\t" + Math.round(avr));
        for (int i = 0; i < num; i++) {
            if (str[i].length() < Math.round(avr)) {
                System.out.println("Строка меньше средней длины" + " номер: " + (i + 1) + "\t" + "длина строки = " + str[i].length());
            }
            else if (str[i].length() > Math.round(avr)) {
                System.out.println("Строка больше средней длины" + " номер: " + (i + 1) + "\t" + "длина строки = " + str[i].length());
            }
        }
    }
}