package aalekseenko.Lection7.Clothes.Shoes;

public class EccoShoes implements Shoes{
    private int price;

    public EccoShoes(int price) {
        this.price = price;
    }

    @Override
    public void putOn() {
        System.out.println(" одевает обувь Ecco");
    }

    @Override
    public void takeOff() {
        System.out.println(" снимает обувь Ecco");
    }
}
