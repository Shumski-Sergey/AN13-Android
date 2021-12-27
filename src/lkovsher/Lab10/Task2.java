package lkovsher.Lab10;
/*2.Создать коллекцию, наполнить ее случайными числами. Удалить
повторяющиеся числа.*/

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for(int i = 0; i < 30; i++){
            numbers.add(random.nextInt(11));
        }
        System.out.println(numbers);
        List<Integer> number = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println(number);

    }
}
