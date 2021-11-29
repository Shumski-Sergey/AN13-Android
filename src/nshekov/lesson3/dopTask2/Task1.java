package nshekov.lesson3.dopTask2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Enter your number:");
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        char[] numchar = number.toCharArray();
        int sum = 0;
        for (int i = 0; i < number.length(); i++){
            sum += Character.digit(numchar[i], 10);
        }
        System.out.println("Summa is:\n" + sum);
    }
}
