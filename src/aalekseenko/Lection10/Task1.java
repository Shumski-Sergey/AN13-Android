package aalekseenko.Lection10;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        byte numberOfPupil = 20;
        ArrayList<Integer> grade = new ArrayList <>();
        for (int i = 1; i<=numberOfPupil; i++)
        {
            int a = 0;
            int b = 11;
            int randomNumber = a + (int) (Math.random() * b);
            grade.add(randomNumber);
        }
        System.out.println("Список оценок учеников: " + grade);
        for (int i = 0; i < grade.size(); i++){
            if (grade.get(i) < 4) {
                grade.remove(i);
                i--;
            }
        }
        System.out.println("Положительные оценки учеников: " + grade);
    }
}
