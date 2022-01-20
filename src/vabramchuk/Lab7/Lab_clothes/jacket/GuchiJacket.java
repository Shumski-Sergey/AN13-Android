package vabramchuk.Lab7.Lab_clothes.jacket;

public class GuchiJacket implements Ijacket {


    @Override
    public void don() {
        System.out.println("Одеть куртку Гучи");

    }

    @Override
    public void takeoff() {
        System.out.println("Снять куртку Гучи");
    }
}
