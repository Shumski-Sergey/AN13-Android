package aalekseenko.Lection7.Clothes.Jacket;

public class SiveraJacket implements Jacket{
    private int price;

    public SiveraJacket(int price) {
        this.price = price;
    }

    @Override
    public void putOn() {
        System.out.println(" одевает куртку Sivera");
    }

    @Override
    public void takeOff() {
        System.out.println(" снимает куртку Sivera");
    }
}
