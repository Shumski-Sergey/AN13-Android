package vikonnikova.lab5Task1;

public class Check {
    public static void main(String[] args) {
        Clothes  Jeans = new Clothes ("Джинсы");
        Clothes Sweater = new Clothes ("Свитер");
        Clothes Dress = new Clothes ("Платье");

        Jeans.putOn();
        Sweater.sell();
        Dress.discount();
    }
}
