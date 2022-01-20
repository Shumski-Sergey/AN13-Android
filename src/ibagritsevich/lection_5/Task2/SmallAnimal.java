package ibagritsevich.lection_5.Task2;

public class SmallAnimal {

    public int size;
    public int weight;
    public int age;
    public String color;

    public SmallAnimal(int size, int weight, int age, String color){
        this.size = size;
        this.weight = weight;
        this.age = age;
        this.color = color;
    }

    public int getSize() {return size;}
    public int getWeight() {return weight;}
    public int getAge() {return age;}
    public String getColor() {return color;}
}
