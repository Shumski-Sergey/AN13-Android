package kvitko.Laba3.Practic;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите натуральное число: ");
        int a = scanner.nextInt();
        int k=a;
        System.out.print("Положительные делители числа: ");
        while(k!=0){
            if(a%k==0) System.out.print(k+" ");
            k--;
        }
    }
}
