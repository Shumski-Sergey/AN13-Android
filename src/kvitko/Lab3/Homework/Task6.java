package kvitko.Lab3.Homework;

public class Task6 {
    public static void main(String[] args) {
        int a[] = new int[4];
        for (int i = 0; i < a.length; i++)
            a[i] = (int) (Math.random() * 10);

        for (int i : a)
            System.out.print(i + " ");

        System.out.println();

        boolean k = true;
        for (int i = 1; i < a.length; i++) {
            if (a[i] <= a[i - 1]) {
                k = false;
                break;
            }
        }
        if (k) System.out.println("Массив является строго возрастающей последовательностью");
        else System.out.println("Массив не является строго возрастающей последовательностью");
    }
}