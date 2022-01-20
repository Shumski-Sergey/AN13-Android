package epavlyutin.pack10;


import java.util.HashMap;
import java.util.Map;

public class Task1 {

    public static void main(String[] args) {
        Map<Person, Integer> school = new HashMap<>();
        school.put(new Person("Bob"),(int)(Math.random()*10));
        school.put(new Person("Jake"),(int)(Math.random()*10));
        school.put(new Person("Sara"),(int)(Math.random()*10));
        school.put(new Person("Ken"),(int)(Math.random()*10));
        System.out.println("Проверка оценок " + school);
        for (Map.Entry<Person,Integer> item : school.entrySet()){
            if (item.getValue()>4){
                System.out.println(item);
            }
        }

      }
    }
class Person{
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