package vabramchuk.Lab10;

import java.util.HashMap;
import java.util.Map;

public class Lab1 {
    public static void main(String[] args) {
        Map<Person, Integer> kid = new HashMap<>();
        kid.put(new Person("Вася"), (int) (Math.random() * 10));
        kid.put(new Person("Петя"), (int) (Math.random() * 10));
        kid.put(new Person("Ваня"), (int) (Math.random() * 10));
        kid.put(new Person("Леша"), (int) (Math.random() * 10));
        kid.put(new Person("Даша"), (int) (Math.random() * 10));
        kid.put(new Person("Леня"), (int) (Math.random() * 10));
        kid.put(new Person("Миша"), (int) (Math.random() * 10));
        kid.put(new Person("Гоша"), (int) (Math.random() * 10));

        System.out.println("Проставленные оценки " + kid);
        for (Map.Entry<Person, Integer> item : kid.entrySet()) {
            if (item.getValue() >= 4) {
                System.out.println(item);
            }
        }

    }
}

class Person {
    String name;

    public Person(String value) {
        name = value;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
