package epavlyutin.pack10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        Million();
    }

    public static void Million() {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> LinkedList = new LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(1);
            LinkedList.add(1);
        }
        long startTime = System.currentTimeMillis();
        for (int j = 0; j < 1000000; j++) {
            arrayList.get((int) (Math.random() * 1000));
        }
        System.out.println(System.currentTimeMillis() - startTime);

        for (int j = 0; j < 1000000; j++) {
            LinkedList.get((int) (Math.random() * 1000));
        }
        System.out.println(System.currentTimeMillis() - startTime);

    }

}