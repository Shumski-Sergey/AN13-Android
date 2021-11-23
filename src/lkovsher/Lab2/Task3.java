package lkovsher.Lab2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число:");
        int number = scanner.nextInt();
        if(number>0){
            number++;
        } else if (number==0){
            number = 10;
        } else number -=2;
        System.out.println(number);
    }

}
