package nshekov.lesson10.Lab2_3.Tasks_A;

import java.util.*;

public class Pupils {
    public static void main(String[] args) {
        System.out.println("\nУдалить оценки ниже 4:");
        List<Integer> pupils = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            pupils.add(i, (int) (Math.random() * 10));
        }
        System.out.println(pupils);
        pupils.removeIf(integer -> integer <= 3);
        System.out.println(pupils);

        System.out.println("\nУдалить повторяющиеся:");
        List<Integer> rand = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            rand.add(i, (int) (Math.random() * 10));
        }
        System.out.println(rand);
        Set<Integer> myset = new HashSet<>(rand);
        System.out.println(myset);

        System.out.println("\nНайти самую высокую оценку:");
        List<Integer> pupils1 = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            pupils1.add(i, (int) (Math.random() * 10));
        }
        System.out.println(pupils1);
        Iterator<Integer> iter = pupils1.iterator();
        int b = pupils1.get(0), c;
        while (iter.hasNext()){
            c = iter.next();
            if (b < c){
                b = c;
            }
        }
        System.out.println(b);

        System.out.println("\nСравнение скорости изымания объектов ArrayList и LinkedList");
        List<Integer> al = new ArrayList<>();
        List<Integer> ll = new LinkedList<>();

        for (int i = 0; i < 999999; i++) {
            al.add(i, (int) (Math.random() * 10));
            ll.add(i, (int) (Math.random() * 10));
        }
        long startTimeAL = System.currentTimeMillis();
        for (int i = 0; i < 9999; i++) {
            al.get((int) (Math.random() * al.size()));
        }
        long stopTimeAL = System.currentTimeMillis();
        System.out.println("Время перебора AL " + (stopTimeAL - startTimeAL));

        long startTimeLL = System.currentTimeMillis();
        for (int i = 0; i < 9999; i++) {
            ll.get((int) (Math.random() * al.size()));
        }
        long stopTimeLL = System.currentTimeMillis();
        System.out.println("Время перебора LL " + (stopTimeLL - startTimeLL));
    }
}
