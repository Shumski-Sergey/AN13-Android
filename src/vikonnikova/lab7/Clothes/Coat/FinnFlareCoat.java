package vikonnikova.lab7.Clothes.Coat;

public class FinnFlareCoat implements Coat {
    @Override
    public void putOn() {
        System.out.println("надела куртку от FinnFlare");
    }
    public void takeOff() {
        System.out.println("сняла куртку от FinnFlare");
    }
}
