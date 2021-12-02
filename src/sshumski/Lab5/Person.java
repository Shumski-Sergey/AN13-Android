package sshumski.Lab5;

public class Person {
    private int age;
    private String fullName;



    public Person(int age, String fullName) {
        this.age = age;
        this.fullName = fullName;

    }

    public Person() {
    }

    public void move() {

    }

    public void talk() {
        System.out.println(fullName + " Person говорит");
    }
}
