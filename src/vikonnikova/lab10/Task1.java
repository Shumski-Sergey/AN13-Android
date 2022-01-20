package vikonnikova.lab10;

import java.util.ArrayList;
import java.util.Random;


public class Task1 {
    public static void main(String[] args) {
        int i;
        ArrayList <Integer> marks = new ArrayList <>();
        Random rand = new Random();
        for (int j = 1; j<10; j++)
        {
            i = rand.nextInt(10);
            marks.add(i);
        }
        System.out.println("Список оценок: " + marks);
        for (int a = 0; a < marks.size(); a++){
            if (marks.get(a) < 4) {
                marks.remove(a);
                a--;
            }
        }
        System.out.println("Положительные оценки: " + marks);
    }
    }


