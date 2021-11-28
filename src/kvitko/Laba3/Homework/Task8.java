package kvitko.Laba3.Homework;

public class Task8 {
    public static void main(String[] args) {
        int a[] = new int[10];
        for (int i = 0; i < a.length; i++)
            a[i] = (int) (Math.random() * 9);

        int b[] = new int[10];
        for (int i = 0; i < b.length; i++)
            b[i] = (int) (Math.random() * 9);

        double c[] = new double[10];
        for (int i = 0; i < b.length; i++)
            c[i] = (double) a[i] / b[i];

        for (int i : a)
            System.out.print(i + " ");

        System.out.println();

        for (int i : b)
            System.out.print(i + " ");

        System.out.println();

        for (double i : c)
            System.out.print(i + " ");

        System.out.println();

        int k = c.length;
        int number = 0;
        for (int i = 0; i < k; i++)
            if (c[i] % 1 == 0) number++;

        System.out.println("Количество целых элементов в 3 массиве: " + number);


    }
}
