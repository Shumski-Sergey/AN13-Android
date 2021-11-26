package mshpudeyko.Practic2.OneDimensional;
import java.util.Scanner;
import java.util.Random;

public class Tks3 {
    public static void main(String[] args) {
        int size = 15, min = 0, max = 99;
        int array[] = new int[size];
        Random random = new Random();
        int count = 0;
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(max - min + 1);
            if (array[i] % 2 == 0) count++;
        }
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n"+count + " even numbers in massive");
        for (int i = 0; i < size; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
