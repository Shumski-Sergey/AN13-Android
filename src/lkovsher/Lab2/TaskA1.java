package lkovsher.Lab2;

import java.util.Scanner;

public class TaskA1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение а:");
        int a = scanner.nextInt();
        System.out.print("Введите значение b:");
        int b= scanner.nextInt();
        System.out.println((a+b)+ " " + (a-b) + " " + a*b + " " + a/b + " " + a%b );
        double sum = a+b, sub= a-b;
        double del = a/b, prod = a*b, res = a%b;
        System.out.println(sum + " " + sub + " " + prod + " " + del + " " + res  );
    }
}
