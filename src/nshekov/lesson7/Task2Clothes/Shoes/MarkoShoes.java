package nshekov.lesson7.Task2Clothes.Shoes;

public class MarkoShoes implements Shoes{
    public MarkoShoes() {
    }

    @Override
    public void putOn() {
        System.out.println("Надел обувь Марко");
    }

    @Override
    public void takeOff() {
        System.out.println("Снял обувь Марко");
    }
}
