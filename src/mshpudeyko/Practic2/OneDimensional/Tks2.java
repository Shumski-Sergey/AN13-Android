package mshpudeyko.Practic2.OneDimensional;
import java.util.Scanner;

public class Tks2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = 50;
        int array[] = new int[value];
        for (int i = 0, k = 1; i < value; i++, k += 2) {
            array[i] = k;
        }
        System.out.println("\n");
        for (int i = 0; i < value; i++) {
            System.out.print("array[" + i + "]=" + array[i]+"  ");
        }
        System.out.println("\n");
        for(int i=0;i<value;i++){
            array[i]=array[value-1];
        }
        System.out.println("\n");
        for (int i = 0; i < value; i++) {
            System.out.print("array[" + i + "]=" + array[i]+"  ");
        }

    }
}
