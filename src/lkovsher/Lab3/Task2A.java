package lkovsher.Lab3;

import java.util.Scanner;

public class Task2A {
    public static void main(String[] args) {
        int counter=0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число:");
        int a = scanner.nextInt();
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                counter++;
            }
        }
        if(counter>0){
            System.out.println("Число " + a + " не является простым");
        } else System.out.println("Число " + a + " простое");
    }
}
