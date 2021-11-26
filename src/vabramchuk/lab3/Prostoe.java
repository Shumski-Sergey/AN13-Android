package vabramchuk.lab3;
import java.io.*;
import java.util.Scanner;
public class Prostoe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи число");
        int number = scanner.nextInt();
        boolean Result = true;
        int pro;
        for (int i = 2; i <= number / 2; i++) {
                    pro = number % i;
           if (pro == 0) {
           Result = false;
           break;
          }
      }
        if (Result) {
            System.out.println(number + "   -   простое число");
        } else System.out.println(number + "  -  сложное число");
    }
}