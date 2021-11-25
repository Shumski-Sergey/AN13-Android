package vabramchuk.lab2;
import java.util.Scanner;
public class Main2 {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи первое число");

        double a = scanner.nextInt();

        System.out.println("Введи второе число");
        double b = scanner.nextDouble();

        double c = a + b;
        System.out.println("Сумма равна:  " + c);
        double s = a - b;
        System.out.println("Разница равна:  " + s);
        double d = a * b;
        System.out.println("умножение равно:  " + d);
        double f = a / b;
        System.out.println("Деление равно:  " + f);
        int t = (int) (a%b);
        System.out.println("Остаток от деления: " + t);
        int h;
        h = (int) f;
        System.out.println("Целочисленное деление" + h);
    }
}
