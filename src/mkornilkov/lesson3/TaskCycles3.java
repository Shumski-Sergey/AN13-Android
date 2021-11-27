package mkornilkov.lesson3;

import java.util.*;

public class TaskCycles3 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int a = sc.nextInt();
        int counter = a;
        int j = 0;
        while (counter !=0){
            counter = counter / 1000;
            j = j + 1;
        }
        //System.out.println(j);
        int[] b = new int[j];
        int i = 0;
        while (a != 0){
            b[i] = a % 1000;
        //    System.out.println(b[i]);
            i++;
            a = a / 1000;
        }
        System.out.print("Представление заданного числа в бухгалтерском формате ");
        for (i = j - 1; i < b.length; i--) {
            System.out.print(b[i] + " ");
        }
    }
}
