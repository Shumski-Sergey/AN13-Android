package lkovsher.Lab2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int number=0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число:");
        int a = scanner.nextInt();
        if(a>0){
            System.out.print("Положительное ");
        } else if( a<0){
            System.out.print("Отрицательное ");
        } else System.out.println("Заданное число - ноль.");

        while(a != 0){
            a=a/10;
            number++;
        }
        switch(number){
            case 1: {
                System.out.print("однозначное число.");
                break;
            }
            case 2: {
                System.out.print("двузначное число.");
                break;
            }
            case 3: {
                System.out.print("трехзначное число.");
                break;
            }
            case 4: {
                System.out.print("четырехзначное число.");
                break;
            }
            case 5: {
                System.out.println("пятизначное число.");
                break;
            }
            case 6: {
                System.out.println("шестизначное число.");
                break;
            }
            default: {
                break;
            }
        }
    }
}
