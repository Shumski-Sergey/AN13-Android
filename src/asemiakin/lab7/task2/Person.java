package asemiakin.lab7.task2;

import asemiakin.lab7.task2.jackets.*;
import asemiakin.lab7.task2.pants.*;
import asemiakin.lab7.task2.shoes.*;

public class Person {
    String name;
    Jacket jacket;
    Pants pants;
    Shoes shoes;

    public Person(String name, Jacket jacket, Pants pants, Shoes shoes) {
        this.name = name;
        this.jacket = jacket;
        this.pants = pants;
        this.shoes = shoes;
    }

    public String getName() {
        return name;
    }

    void putOn(){
        jacket.putOn();
        pants.putOn();
        shoes.putOn();
    }

    void takeOff() {
        jacket.takeOff();
        pants.takeOff();
        shoes.takeOff();
    }
}
