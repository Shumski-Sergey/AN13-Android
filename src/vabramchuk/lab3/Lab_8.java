package vabramchuk.lab3;

import java.util.Random;

public class Lab_8 {
    public static void main(String[] args) {
        int min = 0, max = 99;
        int[] array = new int[15];
        Random random = new Random();
        for (int i = 0; i < 15; i++) {
            array[i] = random.nextInt(max) + 1;
            System.out.print(array[i] + " ");
            if (array[i] % 2 == 0) {
                min++;
            }

        }
        System.out.println("  ");
        System.out.println("       " + "В массиве " + min + " четных элементов.");
    }
}
