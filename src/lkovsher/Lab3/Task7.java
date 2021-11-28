package lkovsher.Lab3;

import java.util.Random;

public class Task7 {
    public static void main(String[] args) {
        int max = 0, counter=0, index = 0;
        int[] array = new int[12];
        Random random = new Random();
        for(int i = 0; i <= 3; i++) {
            array[i] = random.nextInt(15) + 1;
            System.out.print(array[i] + " ");
            if(array[i] > max){
                max = array[i];
                index = i;
            }
        }
        System.out.println("\n" + "Максимальный элемент массива: " + max + " и его индекс: " + index);
    }
}
