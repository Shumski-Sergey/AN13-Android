package vikonnikova.lab10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int i;
        ArrayList<Integer> marks = new ArrayList<>();
        Random rand = new Random();
        for (int j = 1; j < 10; j++) {
            i = rand.nextInt(10);
            marks.add(i);
        }
        System.out.println("Оценки: " + marks);

        Iterator listIterator = marks.iterator();
        Integer maxValue = 0;
        while (listIterator.hasNext()) {
            Integer integer = (Integer) listIterator.next();
            if (integer > maxValue)
                maxValue = integer;
        }
        System.out.println("Самая высокая оценка: " + maxValue);
    }
}
