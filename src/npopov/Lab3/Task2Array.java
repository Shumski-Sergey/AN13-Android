package npopov.Lab3;

public class Task2Array {
    public static void main(String[] args) {
        int[] arr = new int[50];
        int p = 1;
        for (int i = 0; i < arr.length; i++, p += 2) {
            arr[i] = p;
        }
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println(" ");
        for (int j : arr) {
            System.out.println(j);
        }

    }
}
