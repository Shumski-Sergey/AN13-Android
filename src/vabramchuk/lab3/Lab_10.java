package vabramchuk.lab3;
import java.util.Random;
public class Lab_10 {
    public static float sumArray( int[] array){
        int sum = 0;
        Random random = new Random();
        for(int i = 0; i < 5 ; i++){
            array[i] = random.nextInt(15)+1;
            System.out.print(array[i] + " ");
            sum = sum + array[i];
        }
        sum = sum/array.length;
        return sum;
    }
    public static void main(String[] args) {
        float sum1 = 0, sum2 = 0;
        int[] array1 = new int[5];
        sum1=sumArray(array1);
        System.out.println("\n");
        int[] array2 = new int[5];
        sum2= sumArray(array2);
        if(sum1 > sum2) System.out.println("\n\t" + "Среднее арифметическое элементов первого массива больше, чем во втором.");
        else if(sum2 > sum1) System.out.println("\n\t" +"Среднее арифметическое элементов второго массива больше, чем в первом." );
        else System.out.println("\n\t" + "Среднее арифметическое элементов первого и второго массива равны");
    }
}

