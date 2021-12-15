package aalekseenko.Lection7.Clothes.Jacket;

public class ChinaJacket implements Jacket{
    private int price;

    public ChinaJacket(int price) {
        this.price = price;
    }

    @Override
    public void putOn() {
        System.out.println(" одевает куртку China");
    }

    @Override
    public void takeOff() {
        System.out.println(" снимает куртку China");
    }
}
