package nshekov.lesson2;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        System.out.println("Введите четырёхзначное число:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int digits = sumDigitsInNumber(number);
        System.out.println("Сумма цифр введенного числа:\n" + digits);
    }
    static int sumDigitsInNumber(int number){
        String num = String.valueOf(number);
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            sum += Integer.parseInt(String.valueOf(num.charAt(i)));
        }
        return sum;
    }
}
