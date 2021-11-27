package npopov.Lab3;

public class Task1ArrayDop {

    public static void arrayFilling(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
    }

    public static void arrayOutput(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public static void arrayElementPr(int[] arr) {
        int pr = 1;
        for (int j : arr) {
            if (j % 3 == 0) {
                pr *= j;
            }
        }
        System.out.println("\nPr: " + pr);
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        arrayFilling(arr);
        System.out.print("Массив: ");
        arrayOutput(arr);
        arrayElementPr(arr);
    }
}
