package kvitko.Additional_tasks;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите a: ");
        int a = scanner.nextInt();
        System.out.print("Введите b: ");
        int b = scanner.nextInt();
        System.out.print("Введите c: ");
        int c = scanner.nextInt();
        int number1=0,number2=0,number3=0;
        if(a>0) number1++;
        if(b>0) number1++;
        if(c>0) number1++;
        System.out.println("Чисел, больших нуля: "+number1);
        if(a<0) number2++;
        if(b<0) number2++;
        if(c<0) number2++;
        System.out.println("Чисел, меньших нуля: "+number2);
        if(a==0) number3++;
        if(b==0) number3++;
        if(c==0) number3++;
        System.out.println("Чисел, равных нулю: "+number3);
    }
}