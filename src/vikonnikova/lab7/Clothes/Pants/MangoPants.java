package vikonnikova.lab7.Clothes.Pants;

public class MangoPants implements Pants {
    @Override
    public void putOn() {
        System.out.println("надела штаны от Mango");
    }
    public void takeOff() {
        System.out.println("сняла штаны от Mango");
    }
}
