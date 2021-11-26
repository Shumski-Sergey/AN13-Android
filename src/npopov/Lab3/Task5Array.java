package npopov.Lab3;

public class Task5Array {

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

    public static int arrayAverage(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum / arr.length;
    }

    public static void arrayComparison(int a1, int a2) {
        if (a1 > a2) {
            System.out.println("Среднее арифметическое у первого массива больше!");
        } else if (a1 < a2) {
            System.out.println("Среднее арифметическое у второго массива больше!");
        } else {
            System.out.println("Средние арифметические массивов равны!");
        }
    }

    public static void main(String[] args) {
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        int averageN1, averageN2;
        arrayFilling(arr1);
        arrayFilling(arr2);
        System.out.print("Первый массив: ");
        arrayOutput(arr1);
        System.out.print("\nВторой массив: ");
        arrayOutput(arr2);
        averageN1 = arrayAverage(arr1);
        averageN2 = arrayAverage(arr2);
        System.out.println("\nCА1: " + averageN1);
        System.out.println("CА2: " + averageN2);
        arrayComparison(averageN1, averageN2);
    }
}
