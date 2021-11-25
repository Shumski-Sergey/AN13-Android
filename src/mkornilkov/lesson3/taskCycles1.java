package mkornilkov.lesson3;

import java.util.Scanner;

public class taskCycles1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int[] b = new int[10];
        int i = 0;
        while (a != 0){
            i = i+1;
            b [i] = a % 10;
            a = a/10;
            System.out.print(b[i]+" ");
            }
        int sum = 0;
        for (int j = 0; j< b.length; j++) {
            sum = sum + b[j];
        }
        System.out.println("Сумма цифр заданного числа = "+sum);
    }
}
