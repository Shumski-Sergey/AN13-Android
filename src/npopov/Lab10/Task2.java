package npopov.Lab10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {
        int size = 7;
        ArrayList<Integer> grade = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            grade.add((int) (Math.random() * 10 + 1));
        }
        System.out.println(grade);
        Set<Integer> set = new HashSet<>(grade);
        grade.clear();
        grade.addAll(set);
        System.out.println(grade);
    }
}
