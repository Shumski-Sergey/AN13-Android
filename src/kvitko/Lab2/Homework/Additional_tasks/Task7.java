package kvitko.Lab2.Homework.Additional_tasks;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число программистов: ");
        int a = scanner.nextInt();
        if (a>4 && a<21) System.out.println(a+" программистов");
        else if (a==1) System.out.println(a+ "программист");
        else if (a>=2 && a<=4) System.out.println(a+" программиста");
        else if (a==0) System.out.println(a+ " программистов");
        else System.out.println("Неподходящее число");
    }
}
