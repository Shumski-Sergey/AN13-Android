package aalekseenko.Lection7.Clothes.Pants;

public class HugobossPants implements Pants{
    private int price;

    public HugobossPants(int price) {
        this.price = price;
    }

    @Override
    public void putOn() {
        System.out.println(" одевает штаны Hugoboss");
    }

    @Override
    public void takeOff() {
        System.out.println(" снимает штаны Hugoboss");
    }
}
