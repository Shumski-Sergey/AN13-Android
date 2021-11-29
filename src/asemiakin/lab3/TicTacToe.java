package asemiakin.lab3;

import java.util.Scanner;

public class TicTacToe {
    private static void printField(char[][] array){
        System.out.println("Текущее состояние поля:");
        System.out.println(
                "   1|2|3" + '\n' +
                "1| " + array[0][0] + " " + array[1][0] + " " + array[2][0] + '\n' +
                "2| " + array[0][1] + " " + array[1][1] + " " + array[2][1] + '\n' +
                "3| " + array[0][2] + " " + array[1][2] + " " + array[2][2]
        );
    }

    private static void clearField(char[][] array){
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                array[i][j] = '_';
            }
        }
    }

    private static void playerMove(char[][] array, Scanner scanner, char symbol, String string){
        int scanner1, scanner2;
        while (true){
            System.out.print('\n' + "Ходит игрок за " + string + ". Пожалуйста, введите координаты клетки (через пробел сначала столбец, потом строку), в которую хотите сделать ход: ");
            scanner1 = scanner.nextInt() - 1;
            scanner2 = scanner.nextInt() - 1;
            if (scanner1 <= 2 && scanner1 >=0 && scanner2 <=2 && scanner2>=0)
            {
                if (array[scanner1][scanner2] == '_'){
                    array[scanner1][scanner2] = symbol;
                    break;
                }
                else {
                    System.out.println("Данная клетка уже занята, введите другую!");
                }
            }
            else {
                System.out.println("Ошибка! Введите число от 1 до 3");
            }
        }
    }

    private static boolean checkResults(char[][] array)
    {
        if (checkWin(array,'X'))
        {
            System.out.println("Поздравляем игрока за крестики с победой!");
            return true;
        }
        else if (checkWin(array,'0'))
        {
            System.out.println("Поздравляем игрока за нолики с победой!");
            return true;
        }
        else {
            for (char[] chars : array) {
                for (int j = 0; j < array.length; j++) {
                    if (chars[j] == '_') {
                        return false;
                    }
                }
            }
            System.out.println("Ничья!");
            return true;
        }
    }

    private static boolean checkWin(char[][] array, char symbol){
        return array[0][0] == symbol && array[1][1] == symbol && array[2][2] == symbol ||
                array[2][0] == symbol && array[1][1] == symbol && array[0][2] == symbol ||
                array[0][0] == symbol && array[0][1] == symbol && array[0][2] == symbol ||
                array[1][0] == symbol && array[1][1] == symbol && array[1][2] == symbol ||
                array[2][0] == symbol && array[2][1] == symbol && array[2][2] == symbol ||
                array[0][0] == symbol && array[1][0] == symbol && array[2][0] == symbol ||
                array[0][1] == symbol && array[1][1] == symbol && array[2][1] == symbol ||
                array[0][2] == symbol && array[1][2] == symbol && array[2][2] == symbol;
    }

    private static boolean restartGame(Scanner scanner){
        System.out.println("Хотите сыграть ещё? Если да - введите 1, если нет введите 0: ");
        while (true) {
            int i = scanner.nextInt();
            if (i == 0) {
                return true;
            } else if (i == 1) {
                return false;
            } else {
                System.out.println("Ошибка! Введите 1 либо 0.");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Добро пожаловать в консольную игру «Крестики нолики»! " + '\n' +
                "В игре участвуют два игрока, которые по очереди вводят координаты клетки(через пробел сначала столбец, потом строку), в которую хотят сделать ход. " + '\n' +
                "Первым ходит игрок за крестики. Игра продолжается до победы одного из игроков или ничьи. Приятной игры!");
        char[][] array = new char[3][3];
        Scanner scanner = new Scanner(System.in);
        do {
            clearField(array);
            printField(array);
            for (int i = 0; i < 9; i++) {
                if (i % 2 == 0) playerMove(array, scanner, 'X', "крестики");
                else playerMove(array, scanner, '0', "нолики");
                printField(array);
                if (checkResults(array)) break;
            }
        } while (!restartGame(scanner));
    }
}