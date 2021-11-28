package ibagritsevich.lection_2;

import java.util.Scanner;

public class Task1 {
    public static void znak(int num){
        if (num>0){
            System.out.print("положительное");
        }
        if (num<0){
            System.out.print("отрицательное");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input number: ");
        int num = scanner.nextInt();
        int i = 0;
        int res = num;

        if (num != 0) {
            while (num != 0) {
                num = num / 10;
                i++;
            }
            switch (i) {
                case 1 -> {
                    System.out.println("число однозначное");
                    znak(res);
                }
                case 2 -> {
                    System.out.println("число двухзначное");
                    znak(res);
                }
                case 3 -> {
                    System.out.println("число трехзначное");
                    znak(res);
                }
                default -> {
                    System.out.println("число четырехзначное и более");
                    znak(res);
                }
            }
        }
        else System.out.println("однозначный ноль");
    }
}
