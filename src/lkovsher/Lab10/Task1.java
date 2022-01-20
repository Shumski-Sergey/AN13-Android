package lkovsher.Lab10;
/*1. Создать список оценок учеников с помощью ArrayList, заполнить
случайными оценками. Удалить неудовлетворительные оценки из списка.*/

import java.util.ArrayList;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> marks = new ArrayList<Integer>();
        for(int i = 0; i < 30; i++){
            marks.add(random.nextInt(11));
        }
        System.out.println(marks);
        marks.removeIf(integer -> integer < 4 );
        System.out.println(marks);
    }
}
