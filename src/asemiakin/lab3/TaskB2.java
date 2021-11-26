package asemiakin.lab3;

import java.util.Scanner;

public class TaskB2 {
    public static void main(String[] args) {
        System.out.print("Введите натуральное число (больше 0), делители которого хотите найти: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number > 0) {
            StringBuilder string = new StringBuilder();
            for (int i = number; i > 0; i--) {
                if (number % i == 0) string.append(i).append(" ");
            }
            System.out.println("Все положительные делители введённого числа - " + string);
        } else System.out.println("Ошибка! Введите натуральное число больше 0.");
    }
}
