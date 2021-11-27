package npopov.Lab3;

//если я правильно понял условие, то задание повторилось
public class Task5ArrayDop {

    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 21);
        }
        System.out.print("Массив: ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                arr[i] = 0;
            }
        }
        System.out.print("\nМассив после: ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
