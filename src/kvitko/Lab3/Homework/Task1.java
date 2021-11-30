package kvitko.Lab3.Homework;

public class Task1 {
    public static void main(String[] args) {
        int a[] = new int[10];
        int b = 2;
        for (int i = 0; i < a.length; i++, b += 2) {
            a[i] = b;
        }
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : a) {
            System.out.println(i);
        }
    }
}
