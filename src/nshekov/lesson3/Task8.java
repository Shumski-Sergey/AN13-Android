package nshekov.lesson3;

public class Task8 {
    public static void main(String[] args) {
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        double[] array3 = new double[10];
        int couter = 0;
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 9);
            array2[i] = (int) (Math.random() * 9);
            array3[i] = (double) array1[i]/array2[i];
            if (array3[i] % 1 == 0){
                couter++;
            }
        }
        for (int a : array1){
            System.out.print(a + " ");
        }
        System.out.println();
        for (int a : array2){
            System.out.print(a + " ");
        }
        System.out.println();
        for (double a : array3){
            System.out.format("%.2f ", a);
        }
        System.out.println("\n В третьем массиве " + couter + " целых чисел");
    }
}
