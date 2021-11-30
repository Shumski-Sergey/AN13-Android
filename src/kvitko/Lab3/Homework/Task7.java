package kvitko.Lab3.Homework;

public class Task7 {
    public static void main(String[] args) {
        int a[] = new int[12];
        for (int i = 0; i < a.length; i++)
            a[i] = (int) (Math.random() * 15);

        for (int i : a)
            System.out.print(i + " ");

        System.out.println();

        int max = 0, index = 0;
        for (int i = 0; i < a.length; i++)
            if (max <= a[i]) {
                max = a[i];
                index = i;
            }

        System.out.println("Максимальным является элемент " + max + " с индексом " + index);

    }
}
