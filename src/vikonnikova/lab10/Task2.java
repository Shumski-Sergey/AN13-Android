package vikonnikova.lab10;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int i;
        ArrayList<Integer> numbers = new ArrayList<>();
        Random rand = new Random();
        for (int j = 0; j < 10; j++) {
            i = rand.nextInt(10);
            numbers.add(i);
        }
        System.out.println("Числа: " + numbers);

        LinkedHashSet<Integer> hashSet = new LinkedHashSet<>(numbers);

        ArrayList<Integer> listWithoutDuplicates = new ArrayList<>(hashSet);

        System.out.println("Числа без дубликатов" + listWithoutDuplicates);
    }
}
