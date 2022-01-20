package nshekov.lesson7.Task2Clothes.Shoes;

public class BelwestShoes implements Shoes{
    public BelwestShoes() {
    }

    @Override
    public void putOn() {
        System.out.println("Надел обувь Белвест");
    }

    @Override
    public void takeOff() {
        System.out.println("Снял обувь Белвест");
    }
}
