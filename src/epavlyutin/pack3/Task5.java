package epavlyutin.pack3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите натральное число: ");
        int a  = scanner.nextInt();
        System.out.println("Деляителями числа " + a + " являются");
        for (int i = a; i > 0; i--){
            int b = a % i;
            if (b == 0){
                System.out.println(i + " ");
            }
            }
        }
    }

