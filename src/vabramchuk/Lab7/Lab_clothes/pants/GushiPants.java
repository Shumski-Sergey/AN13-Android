package vabramchuk.Lab7.Lab_clothes.pants;

public class GushiPants implements Ipants{
    @Override
    public void don() {
        System.out.println("Одеть штаны Гучи");
    }

    @Override
    public void takeoff() {
        System.out.println("Снять штаны Гучи");

    }
}
