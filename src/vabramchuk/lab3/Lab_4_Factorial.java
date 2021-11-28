package vabramchuk.lab3;
import java.util.Scanner;
public class Lab_4_Factorial {
    public static void main(String[] args) {
        int suma = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи число для вычисления факториала");
        int i = scanner.nextInt();
        for (int f = 2; f <= i; f++){
           suma *= f;
       } System.out.println("   факториал равен:   " + suma);
    }
}