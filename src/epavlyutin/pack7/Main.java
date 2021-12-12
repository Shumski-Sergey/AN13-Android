package epavlyutin.pack7;

public class Main {
    public static void main(String[] args) {
        Compucter compucter = new Compucter(" AMD Ryzen 7 "," DDR4 "," 1TB ");
        compucter.print();
        compucter.compOn();
        compucter.compOff();
        compucter.infoResult();
    }
}
