package aalekseenko.Lection4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Task2 {
/*
    Ввести n строк с консоли. Упорядочить и вывести строки в порядке возрастания (убывания) значений их длины.
*/
    static class StringLengthSort implements Comparator<String>{
        @Override
        public int compare(String o1, String o2) {
            if(o1.length() > o2.length()){
                return 1;
            }else{
                if(o1.length() < o2.length()){
                    return -1;
                }else{
                    return 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество строк: ");
        int CountStr = sc.nextInt();
        String [] MassStr = new String[CountStr];
        for (int i = 0; i < CountStr; i++) {
            System.out.println("Введите строку №" + (i+1));
            MassStr[i] = sc.next();
        }
            Comparator<String> stringLengthComparator = new StringLengthSort();
            Arrays.sort(MassStr, stringLengthComparator);
            System.out.println("\nОтсортировано по возрастанию длин строк:\n");
            for(String str : MassStr){
                System.out.println(str);
            }
        System.out.println("\nОтсортировано по убыванию длин строк:\n");
        for(int i=(CountStr-1); i>=0; i--) {
            System.out.println(MassStr[i]);
        }

    }
}
