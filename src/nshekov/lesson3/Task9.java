package nshekov.lesson3;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int razm;
        int sum1 = 0;
        int sum2 = 0;
        do {
            System.out.println("Введите размер массива");
            while (!sc.hasNextInt()) {
                System.out.println("Что-то ты не то вводишь.\nПопробуй ещё раз:");
                sc.next();
            }
            razm = sc.nextInt();
        } while (razm < 1);
        int[] array = new int[razm];
        for (int i = 0; i < razm; i++) {
            array[i] = (int) (Math.random() * 15);
            System.out.print(array[i] + " ");
        }
        for (int i = 0; i < razm; i++) {
            if (i < razm/2) {
                sum1 += array[i];
            }
            if (i >= razm/2){
                sum2 += array[i];
            }
        }
        System.out.println();
        if (sum1 > sum2){
            System.out.println("Сумма чисел первой половины массива больше");
        }else if (sum1 < sum2){
            System.out.println("Сумма чисел второй половины массива больше");
        } else {
            System.out.println("Суммы обеих половин массива равны");
        }
    }
}
