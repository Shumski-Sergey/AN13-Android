package aalekseenko.Lection7.Clothes;

import aalekseenko.Lection7.Clothes.Jacket.Jacket;
import aalekseenko.Lection7.Clothes.Pants.Pants;
import aalekseenko.Lection7.Clothes.Shoes.Shoes;

public class Human implements IHuman{
    private String name;
    public Jacket jacket;
    public Pants pants;
    public Shoes shoes;

    public Human(String name, Jacket jacket, Pants pants, Shoes shoes) {
        this.name = name;
        this.jacket = jacket;
        this.pants = pants;
        this.shoes = shoes;
    }

    public String getName() {return name;}
    public void setName() {this.name = name;}

    @Override
    public void getDress() {
       System.out.print(this.name);
       jacket.putOn();
       System.out.print(this.name);
       pants.putOn();
       System.out.print(this.name);
       shoes.putOn();
    }

    @Override
    public void unDress() {
        System.out.print(this.name);
        jacket.takeOff();
        System.out.print(this.name);
        pants.takeOff();
        System.out.print(this.name);
        shoes.takeOff();

    }
}
