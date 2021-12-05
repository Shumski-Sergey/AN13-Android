package nshekov.lesson5.A1;

public class Technic {

    String name;
    String model;
    int age;

    public Technic(String name, String model, int age) {
        this.name = name;
        this.model = model;
        this.age = age;
    }

    public void displayInfo(){
        System.out.println(this.name + " ".concat(this.model) + " ".concat(Integer.toString(this.age)).concat(" года"));
    }

    public void inTheSocket(){
        System.out.println("Включить в розетку ");
    }
}
