package lkovsher.Lab2;

import java.util.Scanner;

public class TaskC1 {

    public static double convertCelsiumToFahrenheit(int celsium){
        return ((celsium*9/5)+32);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение температуры в градусах:");
        int celsium = scanner.nextInt();
        double f = convertCelsiumToFahrenheit(celsium);
        System.out.println("Значение в градусах Фаренгейта:" + f);
    }
}
