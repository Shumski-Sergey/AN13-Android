package vabramchuk.lab3;
import java.util.Scanner;
public class Lab_1_Summa_chisel {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введи число");
    int number = scanner.nextInt();
    int summa = 0;
        while (number > 0) {
        summa = summa + number % 10;
            number = number / 10;
    }
        System.out.println(summa);
}
}