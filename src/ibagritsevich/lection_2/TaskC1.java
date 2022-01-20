package ibagritsevich.lection_2;

import java.util.Scanner;

public class TaskC1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите температуру в Цельсиях, C: ");
        int a = scanner.nextInt();
        System.out.println(convertCelsiumToFahrenheit(a));
    }
    public static double convertCelsiumToFahrenheit(int a) {
        System.out.print("Температура в Фаренгейтах, F: ");
        return (double) (a * 9 / 5) + 32;
    }
}
