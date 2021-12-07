package npopov.Lab5.AnimalsLab5;

public class MainAnimals {
    public static void main(String[] args) {
        Dragon dragon = new Dragon("большой");
        System.out.println(dragon.getSize());
        Goose goose = new Goose("маленький");
        System.out.println(goose.getSize());
    }
}
