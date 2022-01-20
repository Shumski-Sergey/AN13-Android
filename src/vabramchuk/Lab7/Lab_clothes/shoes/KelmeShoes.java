package vabramchuk.Lab7.Lab_clothes.shoes;

public class KelmeShoes implements Ishoes{
    @Override
    public void don() {
        System.out.println("Одеть обувь Кельме\n");
    }

    @Override
    public void takeoff() {
        System.out.println("Снять обувь Кельме\n");

    }
}
