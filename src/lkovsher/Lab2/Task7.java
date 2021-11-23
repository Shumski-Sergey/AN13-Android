package lkovsher.Lab2;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число программистов:");
        int numberProgrammers = scanner.nextInt();
        if(numberProgrammers%10 == 2 || numberProgrammers%10 ==3 || numberProgrammers%10==4){
            System.out.println(numberProgrammers + " программиста");
        } else if(numberProgrammers%10 ==1){
            System.out.println(numberProgrammers + " программист");
        } else System.out.println(numberProgrammers + " программистов");
    }
}
