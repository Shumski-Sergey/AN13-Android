package lkovsher.Lab3;

import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        int max = 10, counter=0;
        int[] array = new int[4];
        Random random = new Random();
        for(int i = 0; i <= 3; i++) {
            array[i] = random.nextInt(max) + 1;
            System.out.print(array[i] + " ");
            if( i+1< 4){
                if (array[i] < array[i+1]) {
                    counter++;
                }
            }
        }
        if(counter == 3){
            System.out.print("\n" + "Последовательность является сторого возрастающей.");
        } else System.out.print("\n" + "Последовательность не является сторого возрастающей.");
    }
}
