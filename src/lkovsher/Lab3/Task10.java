package lkovsher.Lab3;

import java.util.Random;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        int j =0;
        Scanner scanner =  new Scanner(System.in);
        Random random = new Random();
        System.out.print("Введите число, больше 3:");
        int n = scanner.nextInt();
        while( n <= 3){
            System.out.print("Неправильный ввод, введите число больше 3:");
            n =  scanner.nextInt();
        }
        int[] array1 = new int[n];
        int[] array2 = new int[n];
        for(int i = 0; i < n; i++, j++){
            array1[i] = random.nextInt(n) + 1;
            System.out.print(array1[i] + " ");
            if(array1[i]%2 == 0){
                array2[j] = array1[i];
            }
        }
        System.out.print("\n");
        for(int i = 0; i < n; i++) {
            if(array2[i] > 0){
                System.out.print(array2[i] + " ");
            }
        }
    }
}
