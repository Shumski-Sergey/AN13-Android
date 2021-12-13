package vabramchuk.Lab7.Lab_clothes.shoes;

public class MarkoShoes implements Ishoes{
    @Override
    public void don() {
        System.out.println("Одеть обувь Марко\n");

    }

    @Override
    public void takeoff() {
        System.out.println("Снять обувь Марко\n");
    }
}
