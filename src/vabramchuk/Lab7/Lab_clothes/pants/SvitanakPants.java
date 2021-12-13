package vabramchuk.Lab7.Lab_clothes.pants;

public class SvitanakPants implements Ipants{
    @Override
    public void don() {
        System.out.println("Одеть штаны Свитанак");
    }

    @Override
    public void takeoff() {
        System.out.println("Снять штаны Свитанак");

    }
}
