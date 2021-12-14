package ibagritsevich.lection_2;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество программистов: ");
        int number = scanner.nextInt();
        if (number % 10 == 1) {
            System.out.println(number + "\tпрограммист");
        } else if (number % 10 == 2 || number % 10 == 3 || number % 10 == 4) {
            System.out.println(number + "\tпрограммиста");
        } else
            System.out.println(number + "\tпрограммистов");
    }
}

