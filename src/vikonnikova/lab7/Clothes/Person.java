package vikonnikova.lab7.Clothes;

import vikonnikova.lab7.Clothes.Coat.Coat;
import vikonnikova.lab7.Clothes.Pants.Pants;
import vikonnikova.lab7.Clothes.Shoes.Shoes;

public class Person implements Human {
    private String name;
    private Coat coat;
    private Pants pants;
    private Shoes shoes;

    public Person(String name, Coat coat, Pants pants, Shoes shoes) {
        this.name = name;
        this.coat = coat;
        this.pants = pants;
        this.shoes = shoes;
    }
    public String getName () {return name;}
    public void setName (String name) {this.name = name;}

    @Override
    public void putOn() {
//        System.out.println(this.name);
        coat.putOn();
        pants.putOn();
        shoes.putOn();
    }
    @Override
    public void takeOff() {
//        System.out.println(this.name);
        coat.takeOff();
        pants.takeOff();
        shoes.takeOff();
    }
}
