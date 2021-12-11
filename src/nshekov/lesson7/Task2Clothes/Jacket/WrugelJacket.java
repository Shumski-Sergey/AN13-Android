package nshekov.lesson7.Task2Clothes.Jacket;

public class WrugelJacket implements Jacket{

    public WrugelJacket() {
    }

    @Override
    public void putOn() {
        System.out.println("Надел куртку Wrugel");
    }

    @Override
    public void takeOff() {
        System.out.println("Снял куртку Wrugel");
    }
}
