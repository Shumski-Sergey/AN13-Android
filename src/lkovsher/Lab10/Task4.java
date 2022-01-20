package lkovsher.Lab10;

/*4.Напишите метод, который добавляет 1000000 элементов в ArrayList и LinkedList. Напишите еще один метод, который выбирает
 из заполненного списка элемент наугад 10000 раз. Замерьте время, которое потрачено на это. Сравните результаты и предположите, почему они именно такие.
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> number1 = new ArrayList<Integer>();
        LinkedList<Integer> number2 = new LinkedList<Integer>();
        initialization(number1);
        initialization(number2);
        long startTime1 = System.currentTimeMillis();
        choose(number1);
        long endTime1 = System.currentTimeMillis();
        System.out.println(endTime1-startTime1);

        long startTime2 = System.currentTimeMillis();
        choose(number2);
        long endTime2 = System.currentTimeMillis();
        System.out.println(endTime2 - startTime2);
    }

    static void choose(List<Integer> number2){
        Random random = new Random();
        for(int i = 0; i < 1000; i++) {
            int temp = number2.get(random.nextInt(number2.size()));
        }
    }

    static void initialization(List<Integer> number1){
        Random random = new Random();
        for(int i = 0; i < 10000; i++){
            number1.add(random.nextInt(11));
        }
    }
}
