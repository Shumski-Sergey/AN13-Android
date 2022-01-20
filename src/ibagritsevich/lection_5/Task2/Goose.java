package ibagritsevich.lection_5.Task2;

public class Goose extends SmallAnimal {

    String squad;

    public Goose(int size, int weight, int age, String color, String squad) {
        super(size, weight, age, color );
        this.squad = squad;
    }

    public String getSquad() {return squad;}

    public void InfoAboutAnimal(){
        System.out.println("\nРазмер: " + super.getSize() + "\nВес: " + super.getWeight() + "\nВозраст: "
                + super.getAge() + "\nЦвет: " + super.getColor() + "\nОтряд: " + this.getSquad());
    }

    public int getSize() {
        System.out.println("\n" + size + " это размер гуся");
        return size;
    }
}
