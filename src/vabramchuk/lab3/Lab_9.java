package vabramchuk.lab3;
import java.lang.*;
import java.util.Random;
public class Lab_9 {
    public static void main(String[] args) {
        int min = 0, max = 20;
        int[] array = new int[20];
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            array[i] = random.nextInt(max) + 1;
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
        for(int i = 0; i <= 20; i++) {
            if (array[i] % 2 == 1) {
                array[i] = 0;

            }
            System.out.print(array[i] + " ");
        }
    }
    }


