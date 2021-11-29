package vabramchuk.lab3;
import java.util.Random;
public class Lab_11 {
    public static void main(String[] args) {
        int a = 0;
        Random random = new Random();
        int[] array = new int[5];
        for (int i = 0; i < 4; i++) {
            array[i] = random.nextInt(10) + 1;
            System.out.print(array[i] + "  ");}
        for (int i = 0; i < 4; i++) {
            if (i < 4) {
                if (array[i] < array[i + 1])
                    a++;
            }
        }
        if (a == 3){
                System.out.print("\n" + " + ");
            } else System.out.print("\n" + "-");
        }
    }
