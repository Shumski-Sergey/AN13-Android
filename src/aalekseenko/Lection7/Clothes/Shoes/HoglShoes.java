package aalekseenko.Lection7.Clothes.Shoes;

public class HoglShoes implements Shoes{
    private int price;

    public HoglShoes(int price) {
        this.price = price;
    }

    @Override
    public void putOn() {
        System.out.println(" одевает обувь Hogl");
    }

    @Override
    public void takeOff() {
        System.out.println(" снимает обувь Hogl");
    }
}
