package epavlyutin.pack7.clothes.jacket;

public class ZaraJacket implements Jacket{
    public ZaraJacket(){
    }

    @Override
    public void putOn() {
        System.out.println("Надел куртку из зары");
    }

    @Override
    public void takeOff() {
        System.out.println("Снял куртку из зары");
    }
}
