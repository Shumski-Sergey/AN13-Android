package mshpudeyko.Practice3.String;

import java.lang.String;
import java.util.Scanner;

/*
 *  Ввести n строк с консоли.
 * Упорядочить и вывести строки в порядке возрастания (убывания) значений их длины.
 * */
public class Tsk2 {
    public static void quickSort(String[] array, int low, int high) {
        if (array.length == 0)
            return;//завершить выполнение, если длина массива равна 0

        if (low >= high)
            return;//завершить выполнение если уже нечего делить

        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        String opora = array[middle];

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (array[i].length() < opora.length()) {
                i++;
            }

            while (array[j].length() > opora.length()) {
                j--;
            }

            if (i <= j) {//меняем местами
                String temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        // вызов рекурсии для сортировки левой и правой части
        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of strings: ");
        int number = scanner.nextInt();
        String[] strings = new String[number];
        for (int i = 0; i < number; i++) {
            System.out.print("Enter string № " + (i + 1) + " : ");
            strings[i] = scanner.next();
        }
        quickSort(strings,0,number-1);
        System.out.println("New veiw:");
        for(int i=0;i<number;i++){
            System.out.println("strings["+(i+1)+"]="+strings[i]+" ");
        }
    }
}
