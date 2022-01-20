package aalekseenko.Lection7.Clothes.Pants;

public class IncotexPants implements Pants{
    private int price;

    public IncotexPants(int price) {
        this.price = price;
    }

    @Override
    public void putOn() {
        System.out.println(" одевает штаны Incotex");
    }

    @Override
    public void takeOff() {
        System.out.println(" снимает штаны Incotex");
    }
}
