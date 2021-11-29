package nshekov.lesson3;

public class Task7 {
    public static void main(String[] args) {
        int[] array = new int[12];
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 15);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = array.length - 1; i > 0; i--) {
            if (array[max] < array[i-1]){
                max = i-1;
            }
        }
        System.out.println("Element with index " + max + " is max");
    }
}
