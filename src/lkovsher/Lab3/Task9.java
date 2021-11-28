package lkovsher.Lab3;

import java.util.Random;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        int max = 15, sumL = 0, sumR = 0;
        Scanner scanner =  new Scanner(System.in);
        Random random = new Random();
        System.out.print("Введите размер массива:");
        int n = scanner.nextInt();
        while( n <= 0 || (n%2!=0)){
            System.out.print("Неправильный ввод, введите положительное,четное число");
            n = scanner.nextInt();
        }
        int[] array = new int[n];
        for( int i = 0; i < n; i++){
            array[i] = random.nextInt(15)+1;
            System.out.print(array[i] + " ");
        }
        for (int i = 0; i < (array.length/2); i++){
            sumL = sumL + array[i];
        }
        for(int i = array.length/2; i < array.length; i++){
            sumR = sumR + array[i];
        }
        if(sumL > sumR) System.out.print( "\n" + "Сумма элементов левой части массива больше, чем правой.");
        else if(sumR > sumL) System.out.print( "\n" + "Сумма элементов правой части массива больше, чем левой.");
        else System.out.print( "\n" + "Суммы элементов правой части и левой части массивов равны.");
    }
}
