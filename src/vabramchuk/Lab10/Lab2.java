package vabramchuk.Lab10;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Random;

public class Lab2 {
    public static void main(String[] args) {
        int z;
        ArrayList<Integer> numbers = new ArrayList<>();
        Random rand = new Random();
        for (int n = 0; n < 35; n++) {
            z = rand.nextInt(10);
            numbers.add(z);
        }
        System.out.println("Числа: " + numbers);
        LinkedHashSet<Integer> hashSet = new LinkedHashSet<>(numbers);
        ArrayList<Integer> listWithoutDuplicates = new ArrayList<>(hashSet);
        System.out.println("Числа без повторов" + listWithoutDuplicates);
    }
}
