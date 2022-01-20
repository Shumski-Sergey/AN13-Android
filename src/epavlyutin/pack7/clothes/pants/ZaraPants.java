package epavlyutin.pack7.clothes.pants;

public class ZaraPants implements Pants{
    public ZaraPants(){
    }

    @Override
    public void putOn() {
        System.out.println("Надел штаны из зары");
    }

    @Override
    public void takeOff() {
        System.out.println("Снял штаны из зары");
    }
}
