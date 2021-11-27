package npopov.Lab3;

public class Task4ArrayDop {

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

    public static int searchElement(int[] arr) {
        int minElement = arr[0];
        for (int k : arr) {
            if (k % 2 != 0) {
                minElement = k;
                break;
            }
        }
        for (int j : arr) {
            if (j % 2 != 0) {
                if (j < minElement) {
                    minElement = j;
                }
            }
        }
        return minElement;
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        arrayFilling(arr);
        System.out.print("Массив: ");
        arrayOutput(arr);
        System.out.println("\nНаименьший нечетный элемент: " + searchElement(arr));
    }
}
