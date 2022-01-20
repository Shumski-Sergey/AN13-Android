package epavlyutin.pack7.clothes;

import epavlyutin.pack7.clothes.jacket.Jacket;
import epavlyutin.pack7.clothes.pants.Pants;
import epavlyutin.pack7.clothes.shoes.Shoes;

public class Man implements implementation {
    private Jacket jacket;
    private Pants pants;
    private Shoes shoes;
    private String name;

    public Man(Jacket jacket, Pants pants, Shoes shoes, String name) {
        this.jacket = jacket;
        this.pants = pants;
        this.shoes = shoes;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void putOn() {
        System.out.println(getName());
        jacket.putOn();
        pants.putOn();
        shoes.putOn();
    }

    @Override
    public void takeOff() {
        System.out.println(getName());
        jacket.takeOff();
        pants.takeOff();
        shoes.takeOff();
    }

}
