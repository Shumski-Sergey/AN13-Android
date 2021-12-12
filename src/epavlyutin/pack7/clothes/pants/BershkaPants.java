package epavlyutin.pack7.clothes.pants;

public class BershkaPants implements Pants{
    public BershkaPants(){
    }

    @Override
    public void putOn() {
        System.out.println("Надел штаны из бершки");
    }

    @Override
    public void takeOff() {
        System.out.println("Снял штаны из бершки");
    }
}
