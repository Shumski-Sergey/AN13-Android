package lkovsher.Lab2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сторону треугольника:");
        float a = scanner.nextFloat();
        System.out.print("Введите сторону треугольника:");
        float b = scanner.nextFloat();
        System.out.print("Введите сторону треугольника:");
        float c = scanner.nextFloat();
        if((a+b)<= c || (a+c) <= b || (b+c)<=a){
            System.out.println("Треугольника со сторонами " + a + " " + b + " " + c + " не существует.");
        } else System.out.println("Треугольник со сторонами " + a + " " + b + " " + c + " существует.");
    }
}
