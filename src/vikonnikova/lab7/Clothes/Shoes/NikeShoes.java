package vikonnikova.lab7.Clothes.Shoes;

public class NikeShoes implements Shoes {
    @Override
    public void putOn() {
        System.out.println("надела обувь от Nike");
    }
    public void takeOff() {
        System.out.println("сняла обувь от Nike");
    }
}
