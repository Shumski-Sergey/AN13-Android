package nshekov.lesson2.dopTask;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Inter your number:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.print("Это ");
        rank(number);
        sign(number);
        System.out.println("число");
        }
        static void rank(int number) {
            if (number > -10 && number < 10) {
                System.out.print("однозначное");
            }
            else if (number > -100 && number < 100){
                System.out.print("двухзначное");
            }
            else if (number > 99 || number < -99) {
                System.out.print("трехзначное и более");
            }
        }
        static void sign(int number){
            if (number > 0) {
                System.out.print(" положительное ");
            }
            else {
                System.out.print(" отрицательное ");
            }
        }
}
