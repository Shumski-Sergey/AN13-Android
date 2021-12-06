package nshekov.lesson5.B1;

import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первую сумму:");
        String moneyFirst = sc.next();
        long rublesFirst = Long.parseLong(moneyFirst.substring(0, moneyFirst.length() - 3));
        char[] centsIntFirst = moneyFirst.substring(moneyFirst.length() - 2).toCharArray();
        System.out.println("Введите вторую сумму:");
        String moneySecond = sc.next();
        long rublesSecond = Long.parseLong(moneySecond.substring(0, moneySecond.length() - 3));
        char[] centsIntSecond = moneySecond.substring(moneySecond.length() - 2).toCharArray();
        Summ data = new Summ(rublesFirst, centsIntFirst, rublesSecond, centsIntSecond);
        data.summa();
        data.minus();
        data.delenie();
        data.delenieDrobn();
        data.umnozhenieDrobn();
        data.sravnenie();
    }
}
