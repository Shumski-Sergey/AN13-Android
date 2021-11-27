package npopov.Lab3;

public class Task2ArrayDop {

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

    public static double arrayAverage(int[] arr) {
        int sum = 0;
        int num = 0;
        for (int i = 1; i < arr.length; i++) {
            if (i % 2 != 0) {
                sum += arr[i];
                num++;
            }
        }
        return (double) sum / num;
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        arrayFilling(arr);
        System.out.print("Массив: ");
        arrayOutput(arr);
        System.out.println("Cреднее арифметическое элементов с нечетными номерами: " + arrayAverage(arr));
    }
}
