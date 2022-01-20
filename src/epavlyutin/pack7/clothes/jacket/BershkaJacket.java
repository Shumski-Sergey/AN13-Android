package epavlyutin.pack7.clothes.jacket;

public class BershkaJacket implements Jacket{
    public BershkaJacket(){
    }

    @Override
    public void putOn() {
        System.out.println("Надел куртку из бершки");
    }

    @Override
    public void takeOff() {
        System.out.println("Снял куртку из бершки");
    }
}
