package lkovsher.Lab3;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int max = 99, counter = 0;
        int[] array = new int[15];
        Random random = new Random();
        for(int i = 0; i < 15; i++){
            array[i] = random.nextInt(max) + 1;
            System.out.print(array[i] + " ");
            if(array[i]%2 == 0){
                counter++;
            }
        }
        System.out.print("\n" + "В массиве " + counter + " четных элементов." );
    }
}
