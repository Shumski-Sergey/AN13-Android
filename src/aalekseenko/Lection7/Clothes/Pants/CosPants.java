package aalekseenko.Lection7.Clothes.Pants;

public class CosPants implements Pants{
    private int price;

    public CosPants(int price) {
        this.price = price;
    }

    @Override
    public void putOn() {
        System.out.println(" одевает штаны Cos");
    }

    @Override
    public void takeOff() {
        System.out.println(" снимает штаны Cos");
    }
}
