package aalekseenko.Lection7.Clothes.Jacket;

public class BaonJacket implements Jacket{
    private int price;

    public BaonJacket(int price) {
        this.price = price;
    }

    @Override
    public void putOn() {
        System.out.println(" одевает куртку Baon");
    }

    @Override
    public void takeOff() {
        System.out.println(" снимает куртку Baon");
    }
}
