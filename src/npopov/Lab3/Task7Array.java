package npopov.Lab3;

//ещё не сделал
public class Task7Array {

    public static void arrayFilling(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 16);
        }
    }

    public static void arrayOutput(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public static void arrayMaxElement(int[] arr) {
        int maxElement = 0;
        int ind = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxElement) {
                maxElement = arr[i];
                ind = i;
            }
        }
        System.out.println("\nMax: " + maxElement);
        System.out.println("Индекс элемента: " + ind);
    }

    public static void main(String[] args) {
        int[] arr = new int[12];
        arrayFilling(arr);
        arrayOutput(arr);
        arrayMaxElement(arr);
    }
}
