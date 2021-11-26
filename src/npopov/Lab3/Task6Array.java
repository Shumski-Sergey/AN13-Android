package npopov.Lab3;

public class Task6Array {

    public static void arrayFilling(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 11);
        }
    }

    public static void arrayOutput(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public static void arrayIncreasing(int[] arr) {
        boolean bol = false;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                bol = true;
                break;
            }
        }
        if (bol) {
            System.out.println("\nМассив не возрастает!");
        } else {
            System.out.println("\nМассив возрастает!");
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[4];
        arrayFilling(arr);
        System.out.print("Массив: ");
        arrayOutput(arr);
        arrayIncreasing(arr);
    }
}
