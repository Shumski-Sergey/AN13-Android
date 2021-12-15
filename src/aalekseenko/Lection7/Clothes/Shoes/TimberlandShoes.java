package aalekseenko.Lection7.Clothes.Shoes;

public class TimberlandShoes implements Shoes{
    private int price;

    public TimberlandShoes(int price) {
        this.price = price;
    }

    @Override
    public void putOn() {
        System.out.println(" одевает обувь Timberland");
    }

    @Override
    public void takeOff() {
        System.out.println(" снимает обувь Timberland");
    }
}
