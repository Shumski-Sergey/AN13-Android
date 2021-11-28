package lkovsher.Lab3;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int max = 20;
        int[] array = new int[20];
        Random random = new Random();
        for(int i = 0; i < 20; i++) {
            array[i] = random.nextInt(max) + 1;
            System.out.print(array[i] + " ");
        }
        System.out.print("\n");
        for(int i = 0; i < 20; i++) {
            if(i%2 == 1){
                array[i] = 0;
            }
            System.out.print(array[i] + " ");
        }
    }
}
