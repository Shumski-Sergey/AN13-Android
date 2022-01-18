package ibagritsevich.lection_10;

import java.util.LinkedList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {

        List<Integer> random = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            int random_number = 1 + (int) (Math.random() * 15);
            random.add(random_number);
        }

        System.out.println("Список случайных чисел - " + random);

        for (int i = 0; i < random.size(); i++) {
            for (int j = i + 1; j < random.size(); j++) {
                if (random.get(i).equals((random.get(j)))) {
                    random.remove(j);
                    j--;
                }
            }
        }
        System.out.println("Список без повторяющихся чисел - " + random);
    }
}