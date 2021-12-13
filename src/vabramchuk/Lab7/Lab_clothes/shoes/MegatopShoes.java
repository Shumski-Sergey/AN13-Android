package vabramchuk.Lab7.Lab_clothes.shoes;

public class MegatopShoes implements Ishoes {
    @Override
    public void don() {
        System.out.println("Одеть обувь Мегатоп\n");
    }

    @Override
    public void takeoff() {
        System.out.println("Снять обувь Мегатоп\n");
    }
}
