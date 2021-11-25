package sergeyvoitov;

import java.util.Scanner;

public class lab2c1{
    public static void main(String[] args) {
        System.out.println("Введите температуру в градусах Цельсия:");
        Scanner scaner = new Scanner(System.in);
        int  celsium = scaner.nextInt();
        double fahrenheit = convertCelsiumToFahrenheit(celsium);
        System.out.println(celsium + " градусов Цельсия равно " + fahrenheit + " градусов Фаренгейта");
    }

    private static double convertCelsiumToFahrenheit(int celsium){
        double fahrenheit = celsium * 9. / 5 + 32;
        return fahrenheit;
    }
}