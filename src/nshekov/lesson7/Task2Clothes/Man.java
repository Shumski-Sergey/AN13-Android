package nshekov.lesson7.Task2Clothes;

import nshekov.lesson7.Task2Clothes.Jacket.Jacket;
import nshekov.lesson7.Task2Clothes.Pants.Pants;
import nshekov.lesson7.Task2Clothes.Shoes.Shoes;

public class Man implements Realaseble{

    private String name;
    private Jacket jacket;
    private Pants pants;
    private Shoes shoes;

    public Man(String name, Jacket jacket, Pants pants, Shoes shoes) {
        this.name = name;
        this.jacket = jacket;
        this.pants = pants;
        this.shoes = shoes;
    }


    @Override
    public void putOn() {
        System.out.println(this.name);
        jacket.putOn();
        pants.putOn();
        shoes.putOn();
    }

    @Override
    public void takeOff() {
        System.out.println(this.name);
        jacket.takeOff();
        pants.takeOff();
        shoes.takeOff();
    }
}
