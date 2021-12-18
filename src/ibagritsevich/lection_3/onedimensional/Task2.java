package ibagritsevich.lection_3.onedimensional;

public class Task2 {
    public static void main(String[] args) {
        int[] n = new int[51];
        for (int a = 1; a < n.length; a++) {
            n[a] = 2 * a - 1;
            System.out.print(n[a] + " ");
        }
        System.out.println(" ");
        for (int b = n.length - 1; b > 0; b--) {
            n[b] = 2 * b - 1;
            System.out.print(n[b] + " ");
        }
    }
}
