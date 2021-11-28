package ibagritsevich.lection_2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int positive_num = 0;
        int negative_num = 0;
        if (num1 > 0) {
            positive_num++;
        } else if (num1 < 0) negative_num++;
        if (num2 > 0) {
            positive_num++;
        } else if (num2 < 0) negative_num++;
        if (num3 > 0) {
            positive_num++;
        } else if (num3 < 0) negative_num++;
        System.out.println("Положительных чисел: " + positive_num + "\n" + "Отрицаетльных чисел: " + negative_num);

    }
}
