package lkovsher.Lab10;

/*3.Создать список оценок учеников с помощью ArryList, заполнить случайными
оценками. Найти самую высокую оценку с использованием итератора.*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> marks = new ArrayList<Integer>();
        for(int i = 0; i < 30; i++){
            marks.add(random.nextInt(11));
        }
        System.out.println(marks);
        int max = marks.get(0);
        for(Iterator<Integer> it = marks.iterator(); it.hasNext();){
            int temp = it.next();
            if(max < temp){
                max = temp;
            }
        }
        System.out.println("Максимальная отметка:" + max);
    }
}
