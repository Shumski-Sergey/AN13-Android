package npopov.Lab10;

import java.util.ArrayList;
import java.util.Collections;

public class Task3 {
    public static void main(String[] args) {
        int student = 7;
        ArrayList<Integer> grade = new ArrayList<>();
        for (int i = 0; i < student; i++) {
            grade.add((int) (Math.random() * 10 + 1));
        }
        System.out.println(grade);
        System.out.println(Collections.max(grade));
    }
}
