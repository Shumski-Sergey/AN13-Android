package vabramchuk.Lab7.Lab_clothes.jacket;

public class ColambiaJacket implements Ijacket {
    @Override
    public void don() {
        System.out.println("Одеть куртку Коламбия");
    }

    @Override
    public void takeoff() {
        System.out.println("Снять куртку Коламбия");
    }
}
