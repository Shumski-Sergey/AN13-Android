package epavlyutin.pack3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int result = 1;
        int a = scanner.nextInt();
        for (int i = 1; i <= a; i++){
            result = result * i;
        }
        System.out.println(" Факториал вашего числа: " + result);
    }
}
