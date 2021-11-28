package vabramchuk.lab3;

import java.util.Scanner;

public class Lab_5_Deliteli {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("   Введите натуральное число :  ");
        int chislo = scanner.nextInt();
        int a = chislo;
        System.out.print("Положительные делители числа: ");
        while( a != 0 ){
            if(chislo % a == 0) System.out.print(a + " ");
            a--;
        }
    }
}

