package npopov.Lab2;


import java.util.Scanner;

public class Task5_dop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число a: ");
        double a = scanner.nextDouble();
        System.out.println("Введите число b: ");
        double b = scanner.nextDouble();
        System.out.println("Введите число c: ");
        double c = scanner.nextDouble();

        int negNum = 0, posNum = 0;
        if (a > 0) {
            posNum++;
        } else if (a < 0) {
            negNum++;
        }
        if (b > 0) {
            posNum++;
        } else if (b < 0) {
            negNum++;
        }
        if (c > 0) {
            posNum++;
        } else if (c < 0) {
            negNum++;
        }

        System.out.println("Количество положительных чисел: " + posNum);
        System.out.println("Количество отрицательных чисел: " + negNum);
    }


}
