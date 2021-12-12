package vikonnikova.lab7.Clothes.Shoes;

public class TimberlandShoes implements Shoes {
    @Override
    public void putOn() {
        System.out.println("надела обувь от Timberland");
    }
    public void takeOff() {
        System.out.println("сняла обувь от Timberland");
    }
}
