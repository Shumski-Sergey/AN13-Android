package npopov.Lab3;

public class Task3Array {
    public static void main(String[] args) {
        int[] arr = new int[15];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        System.out.print("Массив: ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        int num = 0;
        for (int j : arr) {
            if (j % 2 == 0) {
                num++;
            }
        }
        System.out.println("\nКоличество чётных чисел: " + num);
    }
}
