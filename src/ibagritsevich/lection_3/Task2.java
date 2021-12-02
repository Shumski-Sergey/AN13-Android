package ibagritsevich.lection_3;

import java.util.Scanner;

public class Task2 {
    static int counter = 2;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = scanner.nextInt();
        checkIsItANaturalNumber(num);
    }

    private static void checkIsItANaturalNumber(int num) {
        if (num > 1) {
            if (num % counter != 0) {
                counter++;
                checkIsItANaturalNumber(num);
            } else if (num % counter == 0) {
                printIsItNaturalNumber(counter, num);
            }
        }
    }
    private static void printIsItNaturalNumber(int counter, int num) {
        if (counter == num) {
            System.out.println(num + " Число простое");
        } else {
            System.out.println(num + " Число составное");
        }
    }
}
