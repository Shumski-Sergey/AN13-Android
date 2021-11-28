package lkovsher.Lab3;

import java.util.Random;

public class Task8 {
        public static void main(String[] args) {
            int max = 9, counter = 0;
            int[] array1 = new int[10];
            float[] array2 = new float[10];
            float[] array3 = new float[10];
            Random random = new Random();
            for(int i = 0; i < 10; i++) {
                array1[i] = random.nextInt(max) + 1;
                System.out.print(array1[i] + " ");
            }
            System.out.print("\n");
            for(int i = 0; i < 10; i++) {
                array2[i] = random.nextInt(max) + 1;
                System.out.print(array2[i] + " ");
            }
            System.out.print("\n");
            for(int i = 0; i < 10; i++) {
                array3[i] = array1[i]/array2[i];
                System.out.print(array3[i] + " ");
                if(array3[i]%1 == 0){
                    counter++;
                }
            }
            System.out.print("\n" + "В третьем массиве получилось " + counter + " целых элементов" );
        }
}
