package epavlyutin.pack7.clothes.shoes;

public class ZaraShoes implements Shoes {
    public ZaraShoes() {
    }

    @Override
    public void putOn() {
        System.out.println("Надел кроссовки из зары");
    }

    @Override
    public void takeOff() {
        System.out.println("Снял кроссовки из зары");
    }
}
