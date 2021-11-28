package lkovsher.Lab3;

public class Task2 {
    public static void main(String[] args) {
        int j = 1;
        int[] array = new int[50];
        for(int i = 0; i < 50; i++, j+=2){
            array[i] = j;
            System.out.print(array[i] + " ");
        }
        System.out.print("\n");
        for(int i = 49; i >= 0; i--){
            System.out.print(array[i] + " ");
        }
    }
}
