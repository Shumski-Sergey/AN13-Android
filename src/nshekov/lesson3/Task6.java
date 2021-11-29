package nshekov.lesson3;

public class Task6 {
    public static void main(String[] args) {
        int[] array = new int[4];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int couter = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i+1]){
                couter++;
            }
        }
        if (couter == array.length - 1){
            System.out.println("Возрастающая");
        } else {
            System.out.println("Не возрастающая");
        }
    }
}
