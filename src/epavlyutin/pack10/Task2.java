package epavlyutin.pack10;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> random = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            random.add((int) (Math.random() * 10));

        }
        System.out.println(random);
        Set<Integer> set = new HashSet<>(random);
        System.out.println(set);
    }

}
