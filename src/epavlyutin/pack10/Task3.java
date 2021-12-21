package epavlyutin.pack10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<Integer> random = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            random.add((int) (Math.random() * 10));
        }
        System.out.println(random);
        int max = random.get(0);
        Iterator<Integer> iterator = random.iterator();
        while (iterator.hasNext()) {
            int iter = iterator.next();
            for (int j = 0; j < random.size(); j++) {
                if (max < iter) {
                    max = iter;
                }
            }
        }
        System.out.println(max);

    }
}

