package vikonnikova.lab7.Clothes.Pants;

public class ColinsPants implements Pants {
    @Override
    public void putOn() {
        System.out.println("надела штаны от Colins");
    }
    public void takeOff() {
        System.out.println("сняла штаны от Colins");
    }
}
