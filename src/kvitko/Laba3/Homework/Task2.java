package kvitko.Laba3.Homework;

public class Task2 {
    public static void main(String[] args) {
        int a[] = new int[50];
        int b = 1;
        for (int i = 0; i < a.length; i++, b += 2) {
            a[i] = b;
        }
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i =a.length-1;i>=0;i--)
            System.out.print(a[i]+" ");
    }
}
