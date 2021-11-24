package kvitko.Lab2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num=0;
        System.out.println("Введите число:");
        int a = scanner.nextInt();
        if(a==0) System.out.println("Ваше число равно нулю");
        else if(a>0) System.out.println("Ваше число положительное");
        else if(a<0) System.out.println("Ваше число отрицательное");
        while(a!=0){
            a/=10;
            num++;

        }
        switch (num) {
            case 1:
                System.out.println("Ваше число однозначное");
                break;
            case 2:
                System.out.println("Ваше число двузначное");
                break;
            case 3:
                System.out.println("Ваше число трёхзначное");
                break;
            case 4:
                System.out.println("Ваше число четырёхзначное");
                break;
            case 5:
                System.out.println("Ваше число пятизначное");
                break;
            case 6:
                System.out.println("Ваше число шестизначное");
                break;
            case 7:
                System.out.println("Ваше число семизначное");
                break;
        }
        }

    }

