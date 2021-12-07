package epavlyutin;

import java.util.Scanner;

public class workC1 {


    public static double convertCelsiumToFarenheit(int celsium) {
        return celsium * 9/5 + 32;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите температуру в цельясиях: ");
         int cels = scanner.nextInt();
        System.out.println(convertCelsiumToFarenheit(25));


        System.out.println(convertCelsiumToFarenheit(cels));
    }
    }









