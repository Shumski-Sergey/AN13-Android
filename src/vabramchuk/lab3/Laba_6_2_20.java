package vabramchuk.lab3;
public class Laba_6_2_20 {
    public static void main(String[] args) {
        int[] arrey = new int[10];
        int i = 0;
        int b = 2;
        while (i < 10) {
            arrey[i] = b;
            b += 2;
            i++;
        }
        for (i = 0; i < 10; i++)
            System.out.print(arrey[i] + " ");
        System.out.println();
        for (i = 0; i < 10; i++)
            System.out.println(arrey[i]);
    }
}
