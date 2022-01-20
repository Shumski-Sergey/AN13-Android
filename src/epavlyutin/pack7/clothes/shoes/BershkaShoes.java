package epavlyutin.pack7.clothes.shoes;

public class BershkaShoes implements Shoes {
    public BershkaShoes() {
    }

    @Override
    public void putOn() {
        System.out.println("Надел кроссовки из бершки");
    }

    @Override
    public void takeOff() {
        System.out.println("Снял кроссовки из бершки");
    }
}
