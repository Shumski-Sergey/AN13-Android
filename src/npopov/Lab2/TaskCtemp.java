package npopov.Lab2;

import java.util.Scanner;

public class TaskCtemp {

    public static double convertCelsiumToFahrenheit(int celsium) {
        return celsium * 9.0 / 5 + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int ts = scanner.nextInt();
        System.out.println(convertCelsiumToFahrenheit(ts));
    }
}
