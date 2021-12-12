package vikonnikova.lab7.Clothes.Pants;

public class LevisPants implements Pants {
    @Override
    public void putOn() {
        System.out.println("надела штаны от Levis");
    }
    public void takeOff() {
        System.out.println("сняла штаны от Levis");
    }
}
