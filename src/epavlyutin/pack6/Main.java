package epavlyutin.pack6;

public class Main {
    public static void main(String[] args) {
        Tshirt tshirt = new Tshirt("Майка");
        Diaper diaper = new Diaper("памперс");
        tshirt.discont();
        tshirt.sell();
        diaper.move();
        diaper.sell();
    }
}
