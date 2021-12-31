package ibagritsevich.lection_3.onedimensional;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int sum1 = 0;
        double average1 = 0;
        int[] mas1 = new int[5];
        for (int i = 0; i < mas1.length; i++) {
            mas1[i] = (int) (Math.random() * 16);
            sum1 += mas1[i];
            average1 = (float) sum1 / mas1.length;
        }
        System.out.println("Случайный массив mas1:  " + Arrays.toString(mas1) +
                "\nСреднее арифметическое 1го массива:  " + average1 + "\n");

        int[] mas2 = new int[5];
        int sum2 = 0;
        double average2 = 0;
        for (int i = 1; i < mas2.length; i++) {
            mas2[i] = (int) (Math.random() * 16);
            sum2 += mas2[i];
            average2 = (float) sum2 / mas2.length;
        }
        System.out.println("Случайный массив mas2:  " + Arrays.toString(mas2) +
                "\nСреднее арифметическое 2го массива:  " + average2 + "\n");

        if (average1 > average2) {
            System.out.println("Среднее арифметическое 1го массива больше");
        } else if (average1 == average2) {
            System.out.println("Средние арифметические значения равны");
        } else System.out.println("Среднее арифметическое 2го массива больше");
    }
}
