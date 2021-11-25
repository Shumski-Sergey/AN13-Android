package kvitko.Additional_tasks;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите a: ");
        int a = scanner.nextInt();
        System.out.print("Введите b: ");
        int b = scanner.nextInt();
        System.out.print("Введите c: ");
        int c = scanner.nextInt();
        int number=0;
        if(a>0) number++;
        if(b>0) number++;
        if(c>0) number++;
        System.out.println("Чисел, больших нуля: "+number);
    }
}
