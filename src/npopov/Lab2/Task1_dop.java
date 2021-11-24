package npopov.Lab2;

import java.util.Scanner;

public class Task1_dop {

    public static void number(int a){
        if (a > 0) {
            System.out.println("положительное число");
        } else if(a < 0){
            System.out.println("отрицательное число");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = scanner.nextInt();
        int b = a;

        int num = 0;

        if (a != 0) {
            while (a != 0) {
                a /= 10;
                num++;
            }

            switch(num) {
                case 1:
                    System.out.print("Это однозначное ");
                    number(b);
                    break;
                case 2:
                    System.out.print("Это двузначное ");
                    number(b);
                    break;
                default:
                    System.out.print("Это трехзначное и более ");
                    number(b);
                    break;
            }
        } else {
            System.out.println("Однозначный ноль");
        }
    }
}
