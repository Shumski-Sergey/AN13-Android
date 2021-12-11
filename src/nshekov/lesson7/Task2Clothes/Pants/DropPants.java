package nshekov.lesson7.Task2Clothes.Pants;

public class DropPants implements Pants{
    public DropPants() {
    }

    @Override
    public void putOn() {
        System.out.println("Надел штаны Drop");
    }

    @Override
    public void takeOff() {
        System.out.println("Снял штаны Drop");
    }
}
