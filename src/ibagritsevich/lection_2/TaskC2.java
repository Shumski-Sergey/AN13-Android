package ibagritsevich.lection_2;

import java.util.Scanner;

public class TaskC2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите четырехзначное число: ");
        int num = scanner.nextInt();
        System.out.print("Сумма четырехзначного числа: ");
        System.out.println(sumDigitsInNumber(num));

    }

    public static int sumDigitsInNumber(int num) {
        int sum = 0;
        while (num != 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        return sum;
    }
}
