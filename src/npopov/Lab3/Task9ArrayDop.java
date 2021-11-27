package npopov.Lab3;

public class Task9ArrayDop {

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

    public static int arrayElementSearch(int[] arr) {
        int maxElement = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                if (arr[i] > maxElement) {
                    maxElement = arr[i];
                }
            }
        }
        return maxElement;
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        arrayFilling(arr);
        System.out.print("Массив: ");
        arrayOutput(arr);
        System.out.println("\nМаксимальный элемент c четным индексом: " + arrayElementSearch(arr));
    }
}
