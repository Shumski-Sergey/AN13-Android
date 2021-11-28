package vabramchuk.lab3;

public class Lab_7 {
    public static void main(String[] args) {
        int[] arrey = new int[100];
        int i = 0;
        int b = 1;
        while (i < 100) {
            arrey[i] = b;
            b += 2;
            i++;
        }
        for (i = 0; i < 50 ; i++)
            System.out.print(arrey[i] + " ");
        System.out.println(" ");
        for ( i = 50 - 1; i >= 0; i--) {
           System.out.print(arrey[i] + " ");
       }

}
}
