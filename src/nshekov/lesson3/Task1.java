package nshekov.lesson3;

public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = 2 + i*2;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int a : array){
            System.out.println(a);
        }
    }
}
