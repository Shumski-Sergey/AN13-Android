package sergeyvoitov;

import java.util.Scanner;

public class lab2c2 {
    public static void main(String[] args) {
        System.out.println("Введите четырёхзначное число:");
        Scanner scaner = new Scanner(System.in);
        int number = scaner.nextInt();
        int digits = sumDigitsInNumber(number);
        System.out.println("Сумма цифр введенного числа:\n" + digits);
    }
    static int sumDigitsInNumber(int number){
        String num = String.valueOf(number);
        char[] str = num.toCharArray();
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            sum += Character.digit(str[i], 10 );
        }
        return sum;
    }
}

