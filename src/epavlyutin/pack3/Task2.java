package epavlyutin.pack3;

import javax.swing.*;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if ((a % 2 == 0)) {
            System.out.println("Число является простым");
        }else {
            System.out.println("Число не является простым");
    }
}
}
