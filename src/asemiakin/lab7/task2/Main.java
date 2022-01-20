package asemiakin.lab7.task2;

import asemiakin.lab7.task2.jackets.AdidasJacket;
import asemiakin.lab7.task2.jackets.TNFJacket;
import asemiakin.lab7.task2.pants.ArmaniPants;
import asemiakin.lab7.task2.pants.LevisPants;
import asemiakin.lab7.task2.shoes.NikeShoes;
import asemiakin.lab7.task2.shoes.ReebokShoes;

public class Main {
    public static void main(String[] args) {
        //Человек с именем Иван в куртке от Adidas, штанах от Armani, туфлях от Nike
        Person ivan = new Person("Иван", new AdidasJacket(), new ArmaniPants(), new NikeShoes());
        //Человек с именем Владимир в куртке от TNF, штанах от Levi's, туфлях от Reebok
        Person vladimir = new Person("Владимир", new TNFJacket(), new LevisPants(), new ReebokShoes());
        System.out.println("Взаимодействия с человеком по имени  " + ivan.getName() + ":");
        System.out.println();
        ivan.putOn();
        System.out.println();
        ivan.takeOff();
        System.out.println();
        System.out.println("Взаимодействия с человеком по имени  " + vladimir.getName() + ":");
        System.out.println();
        vladimir.putOn();
        System.out.println();
        ivan.takeOff();
    }
}
