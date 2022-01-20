package vabramchuk.Lab7.Lab_clothes.pants;

public class ColambiaPants implements Ipants {
    @Override
    public void don() {
        System.out.println("Одеть штаны Коламбия");

    }

    @Override
    public void takeoff() {
        System.out.println("Снять штаны Коламбия");
    }
}
