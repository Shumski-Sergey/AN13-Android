package sshumski.Lab5;

/**
 * Создать класс Person, который содержит:
 * a) поля fullName, age.
 * б) методы move() и talk(), в которых просто вывести на
 * консоль сообщение -"Такой-то  Person говорит".
 * в) Добавьте два конструктора  - Person() и Person(fullName, age).
 * Создайте два объекта этого класса.
 * Один объект инициализируется конструктором Person(),
 * другой - Person(fullName, age).
 */

public class Runner {
    //TODO @shumski.s: Что делает переменная?! Допиши плизз!!
    private static final int OFFSET_IMAGE = 1043;

    private Character name;
    public static void main(String[] args) {
        Person firstPerson = new Person();
        Person secondPerson = new Person(18-1, "Robert");
        System.out.println(secondPerson);
        System.out.println(OFFSET_IMAGE);
        firstPerson.talk();
        secondPerson.talk();
    }
}
