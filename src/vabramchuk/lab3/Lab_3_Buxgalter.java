package vabramchuk.lab3;
import java.text.NumberFormat;
import java.util.Scanner;
public class Lab_3_Buxgalter {
    public static void main(String[] args) {
      Scanner chislo = new Scanner(System.in);
       System.out.println("Введи обычное число");
       int number = chislo.nextInt();
       NumberFormat f= NumberFormat.getInstance();
       System.out.println("Число в бухгалтерском формате:   "+ f.format(number));
       }
    }
