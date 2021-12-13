package aalekseenko.Lection6.Task1_Interface.Task2_Animal;

public class Runner {
    public static void main(String[] args) {
        Dragon dragon = new Dragon("very big animal");
        Goose goose = new Goose("small animal");
        System.out.println("Dragon - " + dragon.getSize());
        System.out.println("Goose - " + goose.getSize());
    }
}
