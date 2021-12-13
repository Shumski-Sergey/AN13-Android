package vabramchuk.Lab7.Lab_clothes;

import vabramchuk.Lab7.Lab_clothes.jacket.Ijacket;
import vabramchuk.Lab7.Lab_clothes.pants.Ipants;
import vabramchuk.Lab7.Lab_clothes.shoes.Ishoes;

public class clothes implements Iclothes{

    private Ijacket jacket;
    private Ipants pants;
    private Ishoes shoes;
    private String name;

    public clothes(Ijacket jacket, Ipants pants, Ishoes shoes, String name) {
        this.jacket = jacket;
        this.pants = pants;
        this.shoes = shoes;
        this.name = name;
    }

    public Ijacket getJacket() {
        return jacket;
    }

    public void setJacket(Ijacket jacket) {
        this.jacket = jacket;
    }

    public Ipants getPants() {
        return pants;
    }

    public void setPants(Ipants pants) {
        this.pants = pants;
    }

    public Ishoes getShoes() {
        return shoes;
    }

    public void setShoes(Ishoes shoes) {
        this.shoes = shoes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void don() {
        System.out.println("Человек ".concat(name).concat(":"));
        jacket.don();
        pants.don();
        shoes.don();

    }

    @Override
    public void takeoff() {
        System.out.println("Человек ".concat(name).concat(":"));
        jacket.takeoff();
        pants.takeoff();
        shoes.takeoff();

    }
}
