package vikonnikova.lab7.Clothes.Coat;

public class OutventureCoat implements Coat {
    @Override
    public void putOn() {
        System.out.println("надела куртку от Outventure");
    }
    public void takeOff() {
        System.out.println("сняла куртку от Outventure");
    }
}
