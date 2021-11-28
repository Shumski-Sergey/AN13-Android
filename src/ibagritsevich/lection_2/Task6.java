package ibagritsevich.lection_2;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input number: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        if (num1 > num2) {
            System.out.println("Большее число: " + num1);
        } else if (num1 < num2)
            System.out.println("Большее число: " + num2);
        else System.out.println("Числа равны");
    }
}
