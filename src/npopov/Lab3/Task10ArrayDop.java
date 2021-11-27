package npopov.Lab3;

public class Task10ArrayDop {

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

    public static void arraySearchMax(int[] arr) {
        int maxElement = arr[0];
        int numMaxElement = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxElement) {
                maxElement = arr[i];
                numMaxElement = i;
            }
        }
        arr[numMaxElement] = arr[0];
        arr[0] = maxElement;
        System.out.println("\nМаксимальный элемент: " + maxElement);
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        arrayFilling(arr);
        System.out.print("Массив: ");
        arrayOutput(arr);
        arraySearchMax(arr);
        System.out.print("Массив после: ");
        arrayOutput(arr);
    }
}
