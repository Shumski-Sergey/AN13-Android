package npopov.Lab3;

//ещё не сделал
public class Task6ArrayDop {

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

    public static void arrayCheck(int[] arr) {
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j) {
                    num++;
                }
            }
        }
        if (num == 0) {
           System.out.println("\nЭлементы в массиве различны");
        } else {
            System.out.println("\nВ массиве есть повторения");
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        arrayFilling(arr);
        System.out.print("Массив: ");
        arrayOutput(arr);
        arrayCheck(arr);
    }
}
