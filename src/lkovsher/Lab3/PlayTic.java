package lkovsher.Lab3;

import java.util.Scanner;

public class PlayTic {
    public static void coordinate(char ch, int coordinate1, int coordinate2, char[][] array) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите координату 1:");
        coordinate1 = scanner.nextInt();
        while (coordinate1 < 0 && coordinate1 > 2) {
            System.out.print("Введите координату от 0 до 2!");
            coordinate1 = scanner.nextInt();
        }
        System.out.print("Введите координату 2:");
        coordinate2 = scanner.nextInt();
        while (coordinate2 < 0 && coordinate2 > 2) {
            System.out.print("Введите координату от 0 до 2!");
            coordinate2 = scanner.nextInt();
        }
        if (array[coordinate1][coordinate2] != ' ') {
            System.out.print("Данная клетка уже занята, выберите другую." + "\n");
            coordinate(ch, coordinate1, coordinate2, array);
        }
        array[coordinate1][coordinate2] = ch;
    }

    public static int play(char[][] array) {
        int counter = 0;
        System.out.print("\n");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.format("%8s", array[i][j] + "   | ");
            }
            System.out.print("\n" + "_______________________" + "\n");
        }
        System.out.print("\n");
        if ((array[0][0] == array[0][1] && array[0][1] == array[0][2] && array[0][2] == 'X') ||
                (array[1][0] == array[1][1] && array[1][1] == array[1][2] && array[1][2] == 'X') ||
                (array[2][0] == array[2][1] && array[2][1] == array[2][2] && array[2][2] == 'X') ||
                (array[0][0] == array[1][1] && array[1][1] == array[2][2] && array[2][2] == 'X') ||
                (array[0][2] == array[1][2] && array[1][2] == array[2][0] && array[2][0] == 'X') ||
                (array[0][2] == array[1][2] && array[1][2] == array[2][2] && array[2][2] == 'X') ||
                (array[0][1] == array[1][1] && array[1][1] == array[2][1] && array[2][1] == 'X') ||
                (array[0][0] == array[1][0] && array[1][0] == array[2][0] && array[2][0] == 'X')) {
            System.out.print("Игра закончена,выйграли крестики." + "\n");
            counter++;
        } else if ((array[0][0] == array[0][1] && array[0][1] == array[0][2] && array[0][2] == 'O') ||
                (array[1][0] == array[1][1] && array[1][1] == array[1][2] && array[1][2] == 'O') ||
                (array[2][0] == array[2][1] && array[2][1] == array[2][2] && array[2][2] == 'O') ||
                (array[0][0] == array[1][1] && array[1][1] == array[2][2] && array[2][2] == 'O') ||
                (array[0][2] == array[1][2] && array[1][2] == array[2][0] && array[2][0] == 'O') ||
                (array[0][2] == array[1][2] && array[1][2] == array[2][2] && array[2][2] == 'O') ||
                (array[0][1] == array[1][1] && array[1][1] == array[2][1] && array[2][1] == 'O') ||
                (array[0][0] == array[1][0] && array[1][0] == array[2][0] && array[2][0] == 'O')) {
            System.out.print("Игра закончена,выйграли нолики." + "\n");
            counter++;
        }
        return counter;
    }

    public static void main(String[] args) {
        int coordinate1 = 0, coordinate2 = 0;
        char array[][] = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = ' ';
            }
        }
        while (true) {
            coordinate('X', coordinate1, coordinate2, array);
            if (play(array) == 1) break;
            coordinate('O', coordinate1, coordinate2, array);
            if (play(array) == 1) break;
        }
    }
}



