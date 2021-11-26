package nshekov.lesson3;

import java.util.Scanner;

public class KrestNull {
    public static void main(String[] args) {
        int[][] area = new int[3][3];
        System.out.println("Игроки пишут номер места куда хотят поставить свою цифру\nНомера мест:");
        int cout = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                area[i][j] = cout + 1;
                System.out.print(area[i][j] + "\t");
                cout++;
            }
            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                area[i][j] = 0;
            }
        }

        game(area);

    }

    static void newArea(int[][] area){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(area[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static int[][] firstPlayer(int[][] area){
        Scanner sc = new Scanner(System.in);
        System.out.println("Первый игрок ходит:");
        int move = sc.nextInt();
        switch (move){
            case 1:
                if (area[0][0] == 0) {
                    area[0][0] = 1;
                } else{
                    System.out.println("Ход неверный");
                    firstPlayer(area);
                }
                break;
            case 2:
                if (area[0][1] == 0) {
                    area[0][1] = 1;
                } else{
                    System.out.println("Ход неверный");
                    firstPlayer(area);
                }
                break;
            case 3:
                if (area[0][2] == 0) {
                    area[0][2] = 1;
                } else{
                    System.out.println("Ход неверный");
                    firstPlayer(area);
                }
                break;
            case 4:
                if (area[1][0] == 0) {
                    area[1][0] = 1;
                } else{
                    System.out.println("Ход неверный");
                    firstPlayer(area);
                }
                break;
            case 5:
                if (area[1][1] == 0) {
                    area[1][1] = 1;
                } else{
                    System.out.println("Ход неверный");
                    firstPlayer(area);
                }
                break;
            case 6:
                if (area[1][2] == 0) {
                    area[1][2] = 1;
                } else{
                    System.out.println("Ход неверный");
                    firstPlayer(area);
                }
                break;
            case 7:
                if (area[2][0] == 0) {
                    area[2][0] = 1;
                } else{
                    System.out.println("Ход неверный");
                    firstPlayer(area);
                }
                break;
            case 8:
                if (area[2][1] == 0) {
                    area[2][1] = 1;
                } else{
                    System.out.println("Ход неверный");
                    firstPlayer(area);
                }
                break;
            case 9:
                if (area[2][2] == 0) {
                    area[2][2] = 1;
                } else{
                    System.out.println("Ход неверный");
                    firstPlayer(area);
                }
                break;
            default:
                System.out.println("Ход неверный");
                firstPlayer(area);
        }
        return area;
    }

    static int[][] secondPlayer(int[][] area){
        Scanner sc = new Scanner(System.in);
        System.out.println("Второй игрок ходит:");
        int move = sc.nextInt();
        switch (move){
            case 1:
                if (area[0][0] == 0) {
                    area[0][0] = 2;
                } else{
                    System.out.println("Ход неверный");
                    secondPlayer(area);
                }
                break;
            case 2:
                if (area[0][1] == 0) {
                    area[0][1] = 2;
                } else{
                    System.out.println("Ход неверный");
                    secondPlayer(area);
                }
                break;
            case 3:
                if (area[0][2] == 0) {
                    area[0][2] = 2;
                } else{
                    System.out.println("Ход неверный");
                    secondPlayer(area);
                }
                break;
            case 4:
                if (area[1][0] == 0) {
                    area[1][0] = 2;
                } else{
                    System.out.println("Ход неверный");
                    secondPlayer(area);
                }
                break;
            case 5:
                if (area[1][1] == 0) {
                    area[1][1] = 2;
                } else{
                    System.out.println("Ход неверный");
                    secondPlayer(area);
                }
                break;
            case 6:
                if (area[1][2] == 0) {
                    area[1][2] = 2;
                } else{
                    System.out.println("Ход неверный");
                    secondPlayer(area);
                }
                break;
            case 7:
                if (area[2][0] == 0) {
                    area[2][0] = 2;
                } else{
                    System.out.println("Ход неверный");
                    secondPlayer(area);
                }
                break;
            case 8:
                if (area[2][1] == 0) {
                    area[2][1] = 2;
                } else{
                    System.out.println("Ход неверный");
                    secondPlayer(area);
                }
                break;
            case 9:
                if (area[2][2] == 0) {
                    area[2][2] = 2;
                } else{
                    System.out.println("Ход неверный");
                    secondPlayer(area);
                }
                break;
            default:
                System.out.println("Ход неверный");
                secondPlayer(area);
        }
        return area;
    }

    static void game(int[][] area) {
        int coutGame = 0;
        int couter = 1;
        int twoWinners = 0;
        int a = 0;
        while (coutGame == 0 && couter < 5) {
            firstPlayer(area);
            newArea(area);
            secondPlayer(area);
            newArea(area);
            for (int i = 0; i < 3; i++) {
                if (area[i][0] == area[i][1] && area[i][1] == area[i][2] && area[i][0] != 0) {
                    a = area[i][0];
                    twoWinners++;
                    coutGame = 1;
                }
            }
            if(twoWinners == 1) System.out.println("Победил " + a + "й игрок");
            for (int i = 0; i < 3; i++) {
                if (area[0][i] == area[1][i] && area[1][i] == area[2][i] && area[0][i] != 0) {
                    a = area[0][i];
                    twoWinners++;
                    coutGame = 1;
                }
            }
            if(twoWinners == 1) System.out.println("Победил " + a + "й игрок");
            if (area[0][0] == area[1][1] && area[1][1] == area[2][2] && area[0][0] != 0) {
                System.out.println("Победил " + area[1][1] + "й игрок");
                coutGame = 1;
            }
            if (area[0][2] == area[1][1] && area[1][1] == area[2][0] && area[2][0] != 0) {
                System.out.println("Победил " + area[1][1] + "й игрок");
                coutGame = 1;
            }
            couter++;
        }
        if (couter == 5 && coutGame == 0 || twoWinners == 2){
            System.out.println("Ничья");
        }
    }
}
