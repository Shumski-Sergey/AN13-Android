package ibagritsevich.lection_10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {

        int students_number = 20;
        List<Integer> random_grades = new ArrayList<>(students_number);

        for (int i = 0; i < students_number; i++) {
            int random_rating = 1 + (int) (Math.random() * 10);
            random_grades.add(random_rating);
        }

        System.out.println("Список случайных оценок - " + random_grades);

        Iterator<Integer> iterator = random_grades.iterator();
        Integer max = 0;
        while (iterator.hasNext()) {
            Integer num = iterator.next();
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Самая высокая оценка - " + max);
    }
}