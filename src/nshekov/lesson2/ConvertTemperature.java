package nshekov.lesson2;

import java.util.Scanner;

public class ConvertTemperature {
    public static void main(String[] args) {
        System.out.println("Введите температуру в градусах Цельсия:");
        Scanner sc = new Scanner(System.in);
        int celsium = sc.nextInt();
        double fahrenheit = convertCelsiumToFahrenheit(celsium);
        System.out.println(celsium + " градусов Цельсия равно " + fahrenheit + " градусов Фаренгейта");
    }
    static double convertCelsiumToFahrenheit(int celsium){
        double fahrenheit = celsium * 9. / 5 + 32;
        return fahrenheit;
    }
}
