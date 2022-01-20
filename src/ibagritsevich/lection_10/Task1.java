package ibagritsevich.lection_10;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        int students_number = 25;
        List<Integer> rating_list = new ArrayList<>(students_number);

        for (int i = 0; i < students_number; i++) {
            int random_rating = 1 + (int) (Math.random() * 10);
            rating_list.add(random_rating);
        }
        System.out.println("Список случ. оценок - " + rating_list);

        rating_list.removeIf(i -> (i < 5));

        System.out.println("Список без неудовлетворительных оценок - " + rating_list);
    }
}