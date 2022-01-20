package vabramchuk.Lab6.Task2A;

public class Main {
    public static void main(String[] args) {
        SmallAnimal goose = new  Goose();
        BigAnima dragon = new Dragon();
        System.out.println("Гусь  "  .concat(goose.getSize()) );
        System.out.println("Дракон  " .concat(dragon.getSize()));
    }
}
