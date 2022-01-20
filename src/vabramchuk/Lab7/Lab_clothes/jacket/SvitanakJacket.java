package vabramchuk.Lab7.Lab_clothes.jacket;

public class SvitanakJacket implements Ijacket{
    @Override
    public void don() {
        System.out.println("Одеть куртку Свитанак");
    }

    @Override
    public void takeoff() {
        System.out.println("Снять куртку Свитанак");
    }
}
