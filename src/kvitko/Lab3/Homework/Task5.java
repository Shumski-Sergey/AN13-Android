package kvitko.Lab3.Homework;

public class Task5 {
    public static void main(String[] args) {
        int a[] = new int[5];
        int sred_arif_a = 0, sred_arif_b = 0;
        for (int i = 0; i < a.length; i++)
            a[i] = (int) (Math.random() * 15);

        System.out.println("Первый массив:");
        for (int i : a)
            System.out.print(i + " ");

        System.out.println();

        int b[] = new int[5];
        for (int i = 0; i < b.length; i++)
            b[i] = (int) (Math.random() * 15);

        System.out.println("Второй массив:");
        for (int i : b)
            System.out.print(i + " ");

        System.out.println();

        for (int i = 0; i < a.length; i++)
            sred_arif_a += a[i] / 5;
        System.out.println("Среднее арифметическое первого массива: " + sred_arif_a);

        for (int i = 0; i < b.length; i++)
            sred_arif_b += b[i] / 5;
        System.out.println("Среднее арифметическое второго массива: " + sred_arif_b);

        if (sred_arif_a > sred_arif_b) System.out.println("Среднее арифметическое первого массива больше");
        else if (sred_arif_a < sred_arif_b) System.out.println("Среднее арифметическое второго массива больше");
        else System.out.println("Средние арифметические равны");
    }
}
