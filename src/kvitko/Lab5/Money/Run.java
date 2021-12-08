package kvitko.Lab5.Money;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] SecPart = new char[2];
        SecPart[0] = '5';
        SecPart[1] = '7';
        Money Money = new Money(123L, SecPart);
        System.out.print("Enter Second number: ");
        double Second = scanner.nextDouble();
        double First = Money.Transform();
        System.out.println("Sum: " + Money.Sum(First, Second));
        System.out.println("Difference: " + Money.Minus(First, Second));
        System.out.println("Multiplication: " + Money.Multiplication(First, Second));
        System.out.println("Division: " + Money.Divide(First, Second));
        System.out.println("The bigger number is " + Money.Compare(First, Second));

    }
}
