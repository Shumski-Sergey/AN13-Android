package mshpudeyko.Practic2.OneDimensional;

import java.util.Scanner;

public class TicTacToe {
    public static void print(char[][] array) {
        System.out.println("Текущее состояние поля:");
        for (int i = 0, top = 0, side = 0; i < 3; i++, side++) {
            if (top == 0) {
                System.out.println("  __0__1__2__");
                top++;
            }
            System.out.print(side + "|\t");
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean checkRows(char[][] array, char player1, char player2) {
        for (int i = 0, j = 0; i < 3; i++) {
            if (array[i][j] == player1 && array[i][j + 1] == player1 && array[i][j + 2] == player1) {
                print(array);
                System.out.println("Игрок 1 выиграл!");
                return true;
            }
            if (array[i][j] == player2 && array[i][j + 1] == player2 && array[i][j + 2] == player2) {
                print(array);
                System.out.println("Игрок 2 выиграл!");
                return true;
            }
        }
        return false;
    }

    public static boolean checkCols(char[][] array, char player1, char player2) {
        for (int i = 0, j = 0; j < 3; j++) {
            if (array[i][j] == player1 && array[i + 1][j] == player1 && array[i + 2][j] == player1) {
                print(array);
                System.out.println("Игрок 1 выиграл!");
                return true;
            }
            if (array[i][j] == player2 && array[i + 1][j] == player2 && array[i + 2][j] == player2) {
                print(array);
                System.out.println("Игрок 2 выиграл!");
                return true;
            }
        }
        return false;
    }

    public static boolean checkDiagonals(char[][] array, char player1, char player2) {
        int i = 0, j = 0;
        if (array[i][j] == player1 && array[i + 1][j + 1] == player1 && array[i + 2][j + 2] == player1) {
            print(array);
            System.out.println("Игрок 1 выиграл!");
            return true;
        }
        if (array[i][j] == player2 && array[i + 1][j + 1] == player2 && array[i + 2][j + 2] == player2) {
            print(array);
            System.out.println("Игрок 2 выиграл!");
            return true;
        }
        if (array[i][j + 2] == player1 && array[i + 1][j + 1] == player1 && array[i + 2][j] == player1) {
            print(array);
            System.out.println("Игрок 1 выиграл!");
            return true;
        }
        if (array[i][j + 2] == player2 && array[i + 1][j + 1] == player2 && array[i + 2][j] == player2) {
            print(array);
            System.out.println("Игрок 2 выиграл!");
            return true;
        }

        return false;
    }

    public static boolean draw(char[][] array, char player1, char player2) {
        for (int i = 0, k = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (array[i][j] == player1 || array[i][j] == player2) {
                    k++;
                    if (k == 9) {
                        print(array);
                        System.out.println("Ничья!");
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Размерность поля для игры в крестики-нолики будет (3х3)");
        char[][] array = new char[3][3];
        System.out.println("В этой игре могут участвовать только два игрока\nИгрок 1-нолик(0), игрок 2-крестик(X)");
        char player1 = 'O', player2 = 'X';
        int cols, rows;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = '_';
            }
        }

        while (true) {
            print(array);
            while (true) {
                System.out.print("Игрок 1, Ваш ход!\nВыберите строку и столбец: ");
                cols = scanner.nextInt();
                rows = scanner.nextInt();
                if (array[cols][rows] == 'O' || array[cols][rows] == 'X') {
                    System.out.println("Данная ячейка уже занята, введите ещё раз!");
                } else {
                    array[cols][rows] = player1;
                    break;
                }
            }
            if (checkRows(array, player1, player2)) return;
            if (checkCols(array, player1, player2)) return;
            if (checkDiagonals(array, player1, player2)) return;
            if (draw(array, player1, player2)) return;
            while (true) {
                System.out.print("Игрок 2, Ваш ход!\nВыберите строку и столбец: ");
                cols = scanner.nextInt();
                rows = scanner.nextInt();
                if (array[cols][rows] == 'O' || array[cols][rows] == 'X') {
                    System.out.println("Данная ячейка уже занята, введите ещё раз!");
                } else {
                    array[cols][rows] = player2;
                    break;
                }
            }
        }
    }
}
