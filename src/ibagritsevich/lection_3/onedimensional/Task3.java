package ibagritsevich.lection_3.onedimensional;

public class Task3 {
    public static void main(String[] args) {
        int[] n = new int[15];
        int count = 0;
        for (int i = 0; i < n.length; i++) {
            n[i] = (int) (Math.random() * 100);
            System.out.print(n[i] + " ");
            if (n[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println("\nКоличество четных элементов массива: " + count);
    }
}