package kvitko.Additional_tasks;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите a: ");
        int a = scanner.nextInt();
        System.out.print("Введите b: ");
        int b = scanner.nextInt();
        if(a>b) System.out.println("Большее число:" +a);
        else if (a<b) System.out.println("Большее число:" +b);
        else System.out.println("Числа равны");
    }
}