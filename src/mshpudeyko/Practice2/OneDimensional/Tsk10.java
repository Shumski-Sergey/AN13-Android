package mshpudeyko.Practice2.OneDimensional;

import java.util.Scanner;
import java.util.Random;

/*
Пользователь вводит с клавиатуры число большее 3, которое сохраняется в
переменную n. Если пользователь ввёл не подходящее число, то программа
должна выдать соответствующее сообщение. Создать массив из n случайных
целых чисел из отрезка [0;n] и вывести его на экран. Создать второй массив
только из чётных элементов первого массива, если они там есть, и вывести его
на экран.
*/
public class Tsk10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int number;
        while (true) {
            System.out.print("Enter number greater than 3: ");
            number = scanner.nextInt();
            if (number > 3) break;
            System.out.println("Input error.Try again!");
        }
        int []array=new int[number];
        int count=0;
        for (int i = 0; i < number; i++) {
            array[i] = random.nextInt(number + 1);
            System.out.print("array["+i+"]="+array[i]+"  ");
            if(array[i]%2==0) count++;
        }

        if(count>0){
            int[] secArray=new int[count];
            System.out.println("\n");
            for(int i=0,j=0;i<number;i++) {
                if (array[i] % 2 == 0){
                    secArray[j]=array[i];
                    System.out.print("array["+j+"]="+secArray[j]+"  ");
                    j++;
                }
            }
        }
    }

}
