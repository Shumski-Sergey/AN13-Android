package vikonnikova.lab7.Clothes.Coat;

public class ColumbiaCoat implements Coat {
    @Override
    public void putOn() {
        System.out.println("надела куртку от Columbia");
    }
    public void takeOff() {
        System.out.println("сняла куртку от Columbia");
    }
}
