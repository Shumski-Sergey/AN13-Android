package epavlyutin;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 3 переменные: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a + b > c && c + b > a && a + c > b){
            System.out.println("Треугольник существует");
        }else {
            System.out.println("Треугольник не существует");
        }
        }
    }

