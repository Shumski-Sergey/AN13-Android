package aalekseenko.Lection4;

import java.util.Scanner;

public class Task3 {
/*
    Ввести n строк с консоли. Вывести на консоль те строки, длина которых меньше (больше) средней, а также длину.
*/
    public static void main(String[] args) {
        int sum = 0;
        int countStr = 0;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Введите количество строк: ");

        if (keyboard.hasNextInt()) {
            countStr = keyboard.nextInt();
        } else {
            System.out.print("Введены некорректные данные!");

        }
        String[] massStr = new String[countStr];

        keyboard.nextLine();
        for (int i = 0; i < countStr; i++) {

            System.out.printf((i + 1) + " ");

            massStr[i] = keyboard.nextLine();
            sum+=massStr[i].length();
        }
        int average = sum/countStr;
        System.out.println("Строки с длиной меньше средней:");
        for (int i = 0; i < countStr; i++) {
            if (massStr[i].length()<average)
                System.out.println(massStr[i]);
        }
        System.out.println();
        System.out.println("Строки с длиной больше средней:");
        for (int i = 0; i < countStr; i++) {
            if (massStr[i].length()>average)
                System.out.println(massStr[i]);
        }


}}
