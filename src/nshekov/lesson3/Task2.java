package nshekov.lesson3;

import java.sql.Array;

public class Task2 {
    public static void main(String[] args) {
        int array[] = new int[50];
        for (int i = 0; i < array.length; i++){
            array[i] = 1 + i * 2;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = array.length - 1; i >= 0; i--){
            System.out.print(array[i] + " ");
        }
    }
}
