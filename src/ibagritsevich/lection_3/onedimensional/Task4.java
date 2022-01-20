package ibagritsevich.lection_3.onedimensional;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] n = new int[20];
        for (int i = 0; i < n.length; i++) {
            n[i] = (int) (Math.random() * 21);
        }
        System.out.println("Случайный массив: " + Arrays.toString(n));
        for (int i = 0; i < n.length; i++) {
            if (n[i] % 2 > 0) {
                n[i] = 0;
            }
        }
        System.out.println("Массив с заменой нечетных элементов: " + Arrays.toString(n));
    }
}
