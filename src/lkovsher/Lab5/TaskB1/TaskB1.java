package lkovsher.Lab5.TaskB1;

import java.util.Scanner;

public class TaskB1 {
    public static void main(String[] args) {
        double temp;
        Scanner scanner = new Scanner(System.in);
        char[] array = new char[2];
        array[0] = '1';
        array[1] = '9';
        Number number = new Number(234, array);
        temp = number.transfotmation();
        System.out.print("Input number:");
        double numberOne = scanner.nextDouble();
        System.out.println("Сумма с числом:" + number.sum(numberOne,temp));
        System.out.println("Вычитание числа:" + number.subtraction(numberOne,temp));
        System.out.println("Умножение на число:" + number.multiplication(numberOne,temp));
        System.out.println("Деление на число:" + number.division(numberOne,temp));
        if(number.comparison(numberOne,temp)){
            System.out.println("Числа равны.");
        } else System.out.println("Числа не равны");

    }
}
