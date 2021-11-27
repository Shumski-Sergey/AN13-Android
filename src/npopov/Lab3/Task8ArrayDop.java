package npopov.Lab3;
                                                        //здесь есть вопросы
public class Task8ArrayDop {

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
        int max2Element = arr[0];
        int num = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxElement) {
                maxElement = arr[i];
                num = i;
            }
        }
        arr[num] = 0;                                            //вот туут вопрос!!!
        for (int j : arr) {
            if (j > max2Element) {
                max2Element = j;
            }
        }
        System.out.println("\nМаксимальный элемент: " + maxElement);
        System.out.println("Второй по величине элемент: " + max2Element);
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        arrayFilling(arr);
        System.out.print("Массив: ");
        arrayOutput(arr);
        arraySearchMax(arr);
    }
}
