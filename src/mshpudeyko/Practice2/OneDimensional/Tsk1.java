package mshpudeyko.Practice2.OneDimensional;
import java.util.Scanner;
/*
* Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы
массива на экран сначала в строку, отделяя один элемент от другого пробелом, а
затем в столбик (отделяя один элемент от другого началом новой строки). Перед
созданием массива подумайте, какого он будет размера.
* */

public class Tsk1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 2, max = 20;
        int value = max/ 2;
        int array[] = new int[value];
        for (int i = 0, k = 2; i < value; i++, k += 2) {
            array[i] = k;
        }
        for (int i=0;i<value;i++){
            System.out.print("array["+i+"]="+array[i]+"  ");
        }
        System.out.println("\n");
        for(int i=0;i<value;i++){
            System.out.println("array["+i+"]="+array[i]);
        }
    }
}
