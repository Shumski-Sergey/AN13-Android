package aalekseenko.Lection4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество строк: ");
        int CountStr = sc.nextInt();
        String MaxLine = sc.nextLine();

        System.out.println("Строка №1: ");
        String next = sc.nextLine();
        String MinLine = next;
        for (int i = 2; i <= CountStr; i++) {

            System.out.println("Строка" + "№" + i + ": ");
            next = sc.nextLine();
            if (MaxLine.length() < next.length()) {
                MaxLine = next;
            } else if (MinLine.length() > next.length()) {
                MinLine = next;
            }
        }
        System.out.println("MaxLine = ".concat(MaxLine) + " Length = " + MaxLine.length());
        System.out.print("MinLine = ".concat(MinLine) + "  Length = " + MinLine.length());
    }
    }

