package npopov.Lab10;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        int student = 7;
        int negative = 3;
        ArrayList<Integer> grade = new ArrayList<>();
        for (int i = 0; i < student; i++) {
            grade.add((int) (Math.random() * 10 + 1));
        }
        System.out.println(grade);
        for (int i = 0; i < grade.size(); i++) {
            if (grade.get(i) <= negative) {
                grade.remove(i);
                i--;
            }
        }
        System.out.println(grade);
    }
}
