package vikonnikova.lab7.Clothes.Shoes;

public class GucciShoes implements Shoes {
    @Override
    public void putOn() {
        System.out.println("надела обувь от Gucci");
    }
    public void takeOff() {
        System.out.println("сняла обувь от Gucci");
    }
}
