package kvitko.Lab3.Homework;

public class Task4 {
    public static void main(String[] args) {
        int a[] = new int[15];
        for (int i = 0; i < a.length; i++)
            a[i] = (int) (Math.random() * 20);

        for (int i : a)
            System.out.print(i + " ");

        System.out.println();

        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 1) a[i] = 0;
        }
        for (int i : a)
            System.out.print(i + " ");

    }
}
