package nshekov.lesson3;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20);
            System.out.print(array[i] + " ");
            if (i % 2 == 1){
                array[i] = 0;
            }
        }
        System.out.println();
        for (int a : array){
            System.out.print(a + " ");
        }
    }
}
