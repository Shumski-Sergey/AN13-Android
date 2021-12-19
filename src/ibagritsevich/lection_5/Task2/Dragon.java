package ibagritsevich.lection_5.Task2;

public class Dragon extends BigAnimal {

    String squad;

    public Dragon(int size, int weight, int age, String color, String squad) {
        super(size, weight, age, color );
        this.squad = squad;
    }

    public String getSquad() {return squad;}

    public void InfoAboutAnimal(){
        System.out.println("\nРазмер: " + super.getSize() + "\nВес: " + super.getWeight() + "\nВозраст: "
                + super.getAge() + "\nЦвет: " + super.getColor() + "\nОтряд: " + this.getSquad());
    }
    public int getSize() {
        System.out.println("\n" + size + " это размер дракона");
        return size;
    }
}
