package nshekov.lesson5.B1;

import java.util.Scanner;

public class Summ {

    Scanner sc = new Scanner(System.in);
    long r1, r2, rubles;
    int c1Int, c2Int;
    char[] cents;

    public Summ(long r1, char[] c1, long r2, char[] c2) {
        this.c1Int = Integer.parseInt(String.valueOf(c1)) * 10;
        this.c2Int = Integer.parseInt(String.valueOf(c2)) * 10;
        this.r1 = r1 * 1000 + c1Int;
        this.r2 = r2 * 1000 + c2Int;
    }

    public void summa() {
        rubles = (r1 + r2) / 10;
        String summa = Long.toString(rubles);
        rubles = Long.parseLong(summa.substring(0, summa.length() - 2));
        cents = summa.substring(summa.length() - 2).toCharArray();
        System.out.print("Сумма: " + rubles + ",");
        System.out.println(cents);
    }

    public void minus(){
        if (r1 != r2) {
            rubles = (r1 - r2) / 10;
            String minus = Long.toString(rubles);
            rubles = Long.parseLong(minus.substring(0, minus.length() - 2));
            cents = minus.substring(minus.length() - 2).toCharArray();
            System.out.print("Разность: " + rubles + ",");
            System.out.println(cents);
        } else System.out.println("Разность: 0");
    }

    public void delenie(){
        rubles = (r1 + r2) / 10;
        System.out.println("На какое целое число разделить их сумму?");
        rubles /= sc.nextInt();
        String delenie = Long.toString(rubles);
        rubles = Long.parseLong(delenie.substring(0, delenie.length() - 2));
        cents = delenie.substring(delenie.length() - 2).toCharArray();
        System.out.print("Частное от деления: " + rubles + ",");
        System.out.println(cents);
    }

    public void delenieDrobn(){
        rubles = (r1 + r2) / 10;
        System.out.println("На какое дробное число разделить их сумму?");
        rubles /=  sc.nextDouble();
        String delenie = Long.toString(rubles);
        rubles = Long.parseLong(delenie.substring(0, delenie.length() - 2));
        cents = delenie.substring(delenie.length() - 2).toCharArray();
        System.out.print("Частное от деления: " + rubles + ",");
        System.out.println(cents);
    }

    public void umnozhenieDrobn(){
        rubles = (r1 + r2) / 10;
        System.out.println("На какое дробное число умножить их сумму?");
        rubles *=  sc.nextDouble();
        String delenie = Long.toString(rubles);
        rubles = Long.parseLong(delenie.substring(0, delenie.length() - 2));
        cents = delenie.substring(delenie.length() - 2).toCharArray();
        System.out.print("Произведение: " + rubles + ",");
        System.out.println(cents);
    }

    public void sravnenie(){
        if (r1 == r2){
            System.out.println("Числа равны");
        } else{
            System.out.println("Числа не равны друг другу");
        }
    }
}
