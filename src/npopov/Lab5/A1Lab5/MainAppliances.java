package npopov.Lab5.A1Lab5;

public class MainAppliances {
    public static void main(String[] args) {

        Blender blender = new Blender("Bosch", 112.06, 2020, "Белый");
        blender.print();
        Washer washer = new Washer("Samsung", 779.9, 2021, 53);
        washer.print();
        System.out.println(washer.lottery());
    }
}
